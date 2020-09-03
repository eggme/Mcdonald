package eggme.mcdonald.burger;

import eggme.mcdonald.bun.WheatBun;
import eggme.mcdonald.data.*;
import eggme.mcdonald.patty.ShrimpPatty;

public class ShrimpBurger  extends McBurger{

    public ShrimpBurger() {
        super(6, "슈슈버거", 4500, MenuType.BURGER);
        setBun(new WheatBun());
        setPatty(new ShrimpPatty(), new ShrimpPatty());
    }
}
