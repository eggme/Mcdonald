package eggme.mcdonald.burger;

import eggme.mcdonald.bun.Bun;
import eggme.mcdonald.data.Menu;
import eggme.mcdonald.patty.Patty;

public interface Burger extends Menu {
    Patty[] getPatty();
    Bun getBun();
    void setPatty(Patty... patties);
    void setBun(Bun bun);
    void cook(Bun bun, Patty... patties);
}
