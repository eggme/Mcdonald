package eggme.mcdonald.repository;

import eggme.mcdonald.bun.CornBun;
import eggme.mcdonald.bun.McBun;
import eggme.mcdonald.bun.SesameBun;
import eggme.mcdonald.bun.WheatBun;
import eggme.mcdonald.burger.McBurger;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class BunRepository implements Repository<McBun> {

    private static HashMap<String, McBun> bunList;
    private static BunRepository repository = null;

    static{
        repository = new BunRepository();
        bunList = new HashMap<>();
        bunList.put("참깨빵", new SesameBun());
        bunList.put("옥수수빵", new CornBun());
        bunList.put("통밀빵", new WheatBun());
    }

    public void showItems(){
        System.out.println("==========================================================================================================");
        System.out.println(getItemDescription());
        System.out.println("==========================================================================================================");
    }

    private BunRepository(){ }

    public static BunRepository getInstance(){
        return repository;
    }


    @Override
    public String getItemDescription() {
        return bunList.entrySet().stream().map(m -> m.getValue().getNumber()+". " + m.getKey()).sorted().collect(Collectors.joining("\t\t"));
    }

    @Override
    public McBun getItem(int index) {
    	Set<Entry<String, McBun>> temp = bunList.entrySet().stream().filter(map -> map.getValue().getNumber() == index).collect(Collectors.toSet());
    	McBun item = temp.iterator().next().getValue();
        return item;
    }

}
