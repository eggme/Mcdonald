package eggme.mcdonald.patty;

import eggme.mcdonald.data.Source;

public class ShrimpPatty extends McPatty{

    public ShrimpPatty() {
        super(3, "새우 패티", 185, new Source[]{Source.SOUR_CREAM, Source.MAYONNAISE, Source.KETCHUP});
    }
}
