package eggme.mcdonald.burger;

import eggme.mcdonald.bun.WheatBun;
import eggme.mcdonald.data.*;
import eggme.mcdonald.patty.ChickenPatty;

public class ShanghaiBurger extends McBurger{

    public ShanghaiBurger() {
        super(5, "맥스파이시 상하이 버거", 4500, MenuType.BURGER);
        setBun(new WheatBun());
        setPatty(new ChickenPatty(), new ChickenPatty());
    }
}
