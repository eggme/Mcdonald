package eggme.mcdonald.repository;

import eggme.mcdonald.data.ToppingType;

public class RepositorySet {

    private BurgerRepository burgerRepository;
    private BunRepository bunRepository;
    private PattyRepository pattyRepository;

    public RepositorySet(){
        burgerRepository = BurgerRepository.getInstance();
        bunRepository = BunRepository.getInstance();
        pattyRepository = PattyRepository.getInstance();
    }

    public BurgerRepository getBurgerRepository() {
        return burgerRepository;
    }

    public BunRepository getBunRepository() {
        return bunRepository;
    }

    public PattyRepository getPattyRepository() {
        return pattyRepository;
    }

    public Toppingable selectTopping(ToppingType toppingType, int index){
        switch (toppingType){
            case BUN:
                return getBunRepository().getItem(index);
            case PATTY:
                return getPattyRepository().getItem(index);
        }
        return null;
    }
}
