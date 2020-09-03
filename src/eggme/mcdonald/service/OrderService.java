package eggme.mcdonald.service;

import eggme.mcdonald.data.Menu;

import java.util.ArrayList;

public class OrderService {
    private ArrayList<Menu> list;

    private static OrderService orderService;

    static{
        orderService = new OrderService();
    }

    private OrderService(){
        list = new ArrayList<>();
    }

    public static OrderService getInstance(){
        return orderService;
    }

    public ArrayList<Menu> getList() {
        return list;
    }

    public void addList(Menu menu){
        list.add(menu);
    }
}
