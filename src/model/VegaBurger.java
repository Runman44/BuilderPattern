package model;

public class VegaBurger extends Burger {

	@Override
	public float price() {
		return 6;
	}

	@Override
	public String name() {
		return "VegaBurger";
	}

}
