package eggme.mcdonald.repository;

public interface Repository<T> {
    String getItemDescription();
    T getItem(int index);
    void showItems();
}
