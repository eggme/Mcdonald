package eggme.mcdonald.service;

import eggme.mcdonald.burger.McBurger;
import eggme.mcdonald.bun.McBun;
import eggme.mcdonald.patty.McPatty;

public class BurgerService implements Service<McBurger>{

    private OrderService orderService;

    public BurgerService(){
        orderService = OrderService.getInstance();
    }
    @Override
    public McBurger order(McBurger mcBurger) {
        orderService.addList(mcBurger);
        return mcBurger;
    }

    public McBurger order(McBurger mcBurger, McBun mcBun){
        System.out.println("add Topping, Bun");
        mcBurger.setBun(mcBun);
        orderService.addList(mcBurger);
        return mcBurger;
    }

    public McBurger order(McBurger mcBurger, McPatty... patties){
        System.out.println("add Topping, Patties");
        mcBurger.setPatty(patties);
        orderService.addList(mcBurger);
        return mcBurger;
    }

    public McBurger order(McBurger mcBurger, McBun mcBun, McPatty... patties){
        mcBurger.setBun(mcBun);
        mcBurger.setPatty(patties);
        orderService.addList(mcBurger);
        return mcBurger;
    }
}
