package eggme.mcdonald.repository;

import eggme.mcdonald.burger.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BurgerRepository implements Repository<McBurger>{

    private static HashMap<String, McBurger> burgerList;
    private static BurgerRepository repository;

    static{
        repository = new BurgerRepository();
        burgerList = new HashMap<>();
        burgerList.put("빅맥", new BigMacBurger());
        burgerList.put("불고기 버거", new BulgogiBurger());
        burgerList.put("1955 버거", new Burger1955());
        burgerList.put("치킨 버거", new ChickenBurger());
        burgerList.put("맥스파이시 상하이 버거", new ShanghaiBurger());
        burgerList.put("슈슈 버거", new ShrimpBurger());
    }

    private BurgerRepository(){}

    public static BurgerRepository getInstance(){
        return repository;
    }

    public void showItems(){
        System.out.println("==========================================================================================================");
        System.out.println(getItemDescription());
        System.out.println("==========================================================================================================");

    }

    public String getItemDescription(){
        return burgerList.entrySet().stream().map(m -> m.getValue().getNumber()+". "+m.getKey()).sorted().collect(Collectors.joining("\t\t"));
    }

    public McBurger getItem(int index){
    	Set<Entry<String, McBurger>> temp = burgerList.entrySet().stream().filter(map -> map.getValue().getNumber() == index).collect(Collectors.toSet());
    	McBurger item = temp.iterator().next().getValue();
        return item;
    }

}
