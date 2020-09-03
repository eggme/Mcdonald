package eggme.mcdonald.data;

public enum ToppingType {
    BUN(1),
    PATTY(2);

    private int myTopping;
    ToppingType(int topping){
        myTopping = topping;
    }

    public static ToppingType findByTopping(int topping){
        for(ToppingType toppingType : ToppingType.values()){
            if(topping == toppingType.myTopping){
                return toppingType;
            }
        }
        throw new RuntimeException();
    }

    public int getTopping(){
        return myTopping;
    }
}
