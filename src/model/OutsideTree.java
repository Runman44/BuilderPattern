package model;

public class OutsideTree extends Tree {

	@Override
	public void chopTree() {
		System.out.print("OutsideTree:: choptree");
	}

	@Override
	public void decorateTree() {
		System.out.print("OutsideTree:: decorateTree");
	}

	@Override
	public void storeTree() {
		System.out.print("OutsideTree:: storeTree");
	}

}
