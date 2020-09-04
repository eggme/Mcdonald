package eggme.mcdonald.patty;

import eggme.mcdonald.data.Source;
import eggme.mcdonald.repository.Toppingable;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class McPatty implements Patty, Toppingable {

    private int number;
    private String name;
    private int calorie;
    private int price;
    private Source[] sources;

    private McPatty() {}

    public McPatty(int number, String name, int calorie, int price, Source[] sources) {
        this.number = number;
        this.name = name;
        this.calorie = calorie;
        this.sources = sources;
        this.price = price;
    }

    @Override
    public final int getNumber() {
        return number;
    }

    @Override
    public final void setNumber(int number) {
        this.number = number;
    }

    @Override
    public final void setSource(Source... sources) {
        this.sources = sources;
    }

    @Override
    public final Source[] getSource() {
        return sources;
    }

    @Override
    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public final int getCalorie() {
        return calorie;
    }
    
    @Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}
    

    @Override
    public final String description() {
        String desc = Arrays.stream(sources).map(source -> {return source.name();}).collect(Collectors.joining(", "));
        return "[" + name + "] ===> [" + calorie + "kcal][소스 종류 : " + desc + "]";
    }
    
    public void additional(){}
}
