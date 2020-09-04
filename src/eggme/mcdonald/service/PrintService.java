package eggme.mcdonald.service;

import eggme.mcdonald.bun.McBun;
import eggme.mcdonald.burger.McBurger;
import eggme.mcdonald.data.ToppingType;
import eggme.mcdonald.patty.McPatty;
import eggme.mcdonald.repository.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintService {

	private BufferedReader reader;
    private RepositorySet repositorySet;
    private BurgerService burgerService;
    private OrderService orderService;

    public PrintService() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        repositorySet = new RepositorySet();
        burgerService = new BurgerService();
        orderService = OrderService.getInstance();
        try {
            init();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void init() throws Exception{
        System.out.println("==========================================================================================================");
        System.out.println("Mcdonald에 오신걸 환영합니다!");
        System.out.println("==========================================================================================================");
        boolean addOrder = true;
        do{
            addOrder = choiceMenu();
        }while (addOrder);
        System.out.println("주문하신 제품이 다음 제품이 맞습니까?");
        orderService.getList().stream().forEach(b -> System.out.println(b.descirption()));
    }

    private boolean choiceMenu() throws Exception{
        System.out.println("==========================================================================================================");
        System.out.println("메뉴 번호를 골라주세요!");
        repositorySet.getBurgerRepository().showItems();
        McBurger mcBurger = null;
        try {
            int choice = Integer.parseInt(reader.readLine());
            mcBurger = repositorySet.getBurgerRepository().getItem(choice);
            burgerService.order(mcBurger);
        }catch(Exception e){
            System.out.println("잘 못입력하셨습니다. 다시 입력해주세요.");
            choiceMenu();
        }
        String anwser = "";
        do {
            System.out.println("==========================================================================================================");
            System.out.println("토핑을 추가 하시겠습니까?[Y/N]");
            System.out.println("==========================================================================================================");
            anwser = reader.readLine();
            if(anwser.equals("Y")) {
                addTopping(mcBurger);
            }
        }while (anwser.equals("Y"));
        burgerService.lastOrder();
        return false;
    }

    private void addTopping(McBurger mcBurger) throws Exception{
        System.out.println("==========================================================================================================");
        System.out.println("토핑을 골라주세요!!");
        System.out.println("==========================================================================================================");
        System.out.println("1. 빵\t\t2.패티");
        System.out.println("==========================================================================================================");
        ToppingType toppingType = ToppingType.findByTopping(Integer.parseInt(reader.readLine()));
        Repository repository = toppingType == ToppingType.BUN ? repositorySet.getBunRepository() : repositorySet.getPattyRepository();

        // Refactoring
        repository.showItems();
        Toppingable toppingable = repositorySet.selectTopping(toppingType, Integer.parseInt(reader.readLine()));
        if(toppingable instanceof McBun){
            burgerService.order(mcBurger, (McBun) toppingable);
        }else if(toppingable instanceof McPatty){
            burgerService.order(mcBurger, (McPatty)toppingable);
        }
    }
}
