package pattern;

import java.util.ArrayList;
import java.util.List;

import model.Item;

public class Meal {
	
	private List<Item> items = new ArrayList<>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public float getTotalCost(){
		float totalCost = 0;
		for(Item item : items){
			totalCost = totalCost + item.price();
		}
		return totalCost;
	}

	public void showItems() {
		 for (Item item : items) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Packing : " + item.packing().pack());
	         System.out.println(", Price : " + item.price());
	      }	
	}

}
