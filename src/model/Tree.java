package model;

public abstract class Tree {

	public abstract void chopTree();
	public abstract void decorateTree();
	public abstract void storeTree();
	
	public void treeLifeCycle(){
		chopTree();
		decorateTree();
		storeTree();
	}
}
