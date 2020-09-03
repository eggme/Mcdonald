package eggme.mcdonald.burger;

import eggme.mcdonald.bun.WheatBun;
import eggme.mcdonald.data.*;
import eggme.mcdonald.patty.BulgogiPatty;

public class BulgogiBurger  extends McBurger{

    public BulgogiBurger() {
        super(2, "불고기 버거", 2000, MenuType.BURGER);
        setBun(new WheatBun());
        setPatty(new BulgogiPatty());
    }
}
