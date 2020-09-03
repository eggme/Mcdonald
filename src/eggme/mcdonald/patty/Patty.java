package eggme.mcdonald.patty;

import eggme.mcdonald.data.Ingredient;
import eggme.mcdonald.data.Source;

public interface Patty extends Ingredient {
    void setSource(Source... sources);
    Source[] getSource();
}
