package pattern;

import model.ChickenBurger;
import model.Cola;
import model.Sprite;
import model.VegaBurger;

public class MealBuilder {
	
	   public Meal prepareVegMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new VegaBurger());
		      meal.addItem(new Cola());
		      return meal;
		   }   

		   public Meal prepareNonVegMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new ChickenBurger());
		      meal.addItem(new Sprite());
		      return meal;
		   }

}
