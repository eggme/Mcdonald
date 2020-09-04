package eggme.mcdonald.repository;

import eggme.mcdonald.burger.McBurger;
import eggme.mcdonald.patty.BulgogiPatty;
import eggme.mcdonald.patty.ChickenPatty;
import eggme.mcdonald.patty.McPatty;
import eggme.mcdonald.patty.ShrimpPatty;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class PattyRepository implements Repository<McPatty>{

    private static HashMap<String, McPatty> pattyList;
    private static PattyRepository repository = null;

    static{
        repository = new PattyRepository();
        pattyList = new HashMap<>();
        pattyList.put("불고기 패티", new BulgogiPatty());
        pattyList.put("치킨 패티", new ChickenPatty());
        pattyList.put("새우 패티", new ShrimpPatty());
    }

    private PattyRepository(){}

    public static PattyRepository getInstance(){
        return repository;
    }

    public void showItems(){
        System.out.println("==========================================================================================================");
        System.out.println(getItemDescription());
        System.out.println("==========================================================================================================");
    }

    @Override
    public String getItemDescription() {
        return pattyList.entrySet().stream().map(m -> m.getValue().getNumber()+". " + m.getKey()).sorted().collect(Collectors.joining("\t\t"));
    }

    @Override
    public McPatty getItem(int index) {
    	Set<Entry<String, McPatty>> temp = pattyList.entrySet().stream().filter(map -> map.getValue().getNumber() == index).collect(Collectors.toSet());
    	McPatty item = temp.iterator().next().getValue();
        return item;
    }

}
