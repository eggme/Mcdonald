package eggme.mcdonald.burger;

import eggme.mcdonald.bun.SesameBun;
import eggme.mcdonald.data.*;
import eggme.mcdonald.patty.BulgogiPatty;

public class Burger1955  extends McBurger{

    public Burger1955() {
        super(3, "1955 버거", 5500, MenuType.BURGER);
        setBun(new SesameBun());
        setPatty(new BulgogiPatty(), new BulgogiPatty());
    }
}
