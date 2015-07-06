package model;

public class ChristmasTree extends Tree {

	@Override
	public void chopTree() {
		System.out.print("ChristmasTree:: choptree");
	}

	@Override
	public void decorateTree() {
		System.out.print("ChristmasTree:: decorateTree");
	}

	@Override
	public void storeTree() {
		System.out.print("ChristmasTree:: storeTree");
	}
	
}
