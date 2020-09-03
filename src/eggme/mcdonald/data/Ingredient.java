package eggme.mcdonald.data;

public interface Ingredient {
    int getNumber();
    String getName();
    int getCalorie();
    void setNumber(int number);
    void setName(String name);
    void setCalorie(int calorie);
    String description();
}
