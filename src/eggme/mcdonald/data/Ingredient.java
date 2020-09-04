package eggme.mcdonald.data;

public interface Ingredient {
    int getNumber();
    String getName();
    int getCalorie();
    int getPrice();
    void setNumber(int number);
    void setName(String name);
    void setCalorie(int calorie);
    void setPrice(int price);
    String description();
}
