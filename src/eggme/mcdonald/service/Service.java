package eggme.mcdonald.service;

import eggme.mcdonald.burger.McBurger;

public interface Service<T> {
    void order(T t);
}
