package pattern;
import model.ChristmasTree;
import model.OutsideTree;
import model.Tree;


public class Client {

	public static void main(String[] args) {
		  	// Template Pattern is made as a pattern to execute certain methods in a way. 
	 		// treeLifeCycle method calls three method in a certain flow. 
	      Tree tree = new ChristmasTree();
	      tree.treeLifeCycle();
	      System.out.print("");
	      tree = new OutsideTree();
	      tree.treeLifeCycle();
	}

}
