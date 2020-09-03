package eggme.mcdonald.data;

public interface Menu {
    int getNumber();
    void setNumber(int number);
    int getCalorie();
    void setCalorie(int calorie);
    String getName();
    void setName(String name);
    int getPrice();
    void setPrice(int price);
    MenuType getMenuType();
    void setMenuType(MenuType menuType);
    String descirption();
}
