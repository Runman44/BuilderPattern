package model;

public abstract class Drink implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing(){
		return new Bottle();
	}

	@Override
	public abstract float price();

}
