package eggme.mcdonald.service;

import eggme.mcdonald.burger.McBurger;

import java.util.ArrayList;
import java.util.Arrays;

import eggme.mcdonald.bun.McBun;
import eggme.mcdonald.patty.McPatty;
import eggme.mcdonald.patty.Patty;

public class BurgerService implements Service<McBurger>{

    private OrderService orderService;
    private McBurger temp = null;
    private ArrayList<Patty> pattyList;

    public BurgerService(){
        orderService = OrderService.getInstance();
        pattyList = new ArrayList<Patty>();
    }
    @Override
    public void order(McBurger mcBurger) {
    	temp = mcBurger;
    	Arrays.stream(mcBurger.getPatty()).forEach(p -> pattyList.add(p));
    }

    public void order(McBurger mcBurger, McBun mcBun){
        System.out.println("add Topping, Bun");
        mcBurger.setBun(mcBun);
        temp = mcBurger;

    }

    public void order(McBurger mcBurger, McPatty patty){
        System.out.println("add Topping, Patties");
        pattyList.add(patty);
        temp = mcBurger;
    }

    
    public void lastOrder() {
    	McPatty[] list = pattyList.stream().toArray(McPatty[]::new);
    	temp.setPatty(list);
    	orderService.addList(temp);
    }
}
