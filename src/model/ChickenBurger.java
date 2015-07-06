package model;

public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 5;
	}

	@Override
	public String name() {
		return "ChickenBurger";
	}

}
