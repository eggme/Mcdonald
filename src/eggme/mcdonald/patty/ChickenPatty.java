package eggme.mcdonald.patty;

import eggme.mcdonald.data.Source;

public class ChickenPatty extends McPatty{

    public ChickenPatty() {
        super(2, "치킨 패티", 294, 1000, new Source[]{Source.GARLIC, Source.MAYONNAISE, Source.SOUR_CREAM});
    }
}
