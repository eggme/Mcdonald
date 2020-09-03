package eggme.mcdonald.burger;

import eggme.mcdonald.bun.SesameBun;
import eggme.mcdonald.data.*;
import eggme.mcdonald.patty.BulgogiPatty;

public class BigMacBurger  extends McBurger {

    public BigMacBurger() {
        super(1, "빅맥", 4500 , MenuType.BURGER);
        setBun(new SesameBun());
        setPatty(new BulgogiPatty(), new BulgogiPatty());
    }

}
