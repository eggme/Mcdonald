package eggme.mcdonald.burger;

import eggme.mcdonald.bun.CornBun;
import eggme.mcdonald.data.*;
import eggme.mcdonald.patty.ChickenPatty;

public class ChickenBurger  extends McBurger{

    public ChickenBurger() {
        super(4, "치킨 버거", 2500, MenuType.BURGER);
        setBun(new CornBun());
        setPatty(new ChickenPatty());
    }

}
