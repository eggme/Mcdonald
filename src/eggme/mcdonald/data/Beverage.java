package eggme.mcdonald.data;

public interface Beverage extends Menu{
    BeverageSize getBeverageSize();
    void setBeverageSize(BeverageSize beverageSize);
}
