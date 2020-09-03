package eggme.mcdonald.burger;

import eggme.mcdonald.bun.Bun;
import eggme.mcdonald.data.MenuType;
import eggme.mcdonald.patty.Patty;
import eggme.mcdonald.repository.Toppingable;

public abstract class McBurger implements Burger, Toppingable {
    private int number;
    private String name;
    private int price;
    private int calorie;
    private MenuType menuType;
    private Patty[] patties;
    private Bun bun;

    private McBurger(){}

    public McBurger(int number, String name, int price, MenuType menuType) {
        setNumber(number);
        setName(name);
        setPrice(price);
        setMenuType(menuType);
    }

    @Override
    public final int getNumber() {
        return number;
    }

    @Override
    public final String descirption() {
        return "[" + number + "][" + name + "] ===> [" + price + "]";
    }

    @Override
    public final MenuType getMenuType() {
        return menuType;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final int getPrice() {
        return price;
    }

    @Override
    public final int getCalorie() {
        return calorie;
    }

    @Override
    public final void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public final void setPrice(int price) {
        this.price = price;
    }

    @Override
    public final void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    @Override
    public final void setNumber(int number) {
        this.number = number;
    }

    @Override
    public final Patty[] getPatty() {
        return patties;
    }

    @Override
    public final Bun getBun() {
        return bun;
    }

    @Override
    public final void setPatty(Patty... patties) {
        this.patties = patties;
    }

    @Override
    public final void setBun(Bun bun) {
        this.bun = bun;
    }

    @Override
    public final void cook(Bun bun, Patty... patties) {
        setBun(bun);
        setPatty(patties);
    }

    public void additional(){ }
}
