package eggme.mcdonald.bun;

import eggme.mcdonald.repository.Toppingable;

public abstract class McBun implements Bun, Toppingable {

    private int number;
    private String name;
    private int calorie;

    private McBun(){}

    public McBun(int number, String name, int calorie) {
        this.number = number;
        this.name = name;
        this.calorie = calorie;
    }
    @Override
    public final int getNumber() {
        return number;
    }

    @Override
    public final void setNumber(int number) {
        this.number = number;
    }
    @Override
    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public final int getCalorie() {
        return calorie;
    }

    @Override
    public String description() {
        return "[" + name + "] ===> [" + calorie + "kcal]";
    }

    public void additional(){}
}
