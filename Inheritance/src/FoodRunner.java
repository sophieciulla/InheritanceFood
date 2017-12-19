import java.util.ArrayList;

public class FoodRunner 
{
	public static void main(String[] args)
	{
		ArrayList <Food> foodList = new ArrayList <Food>();
		foodList.add(new Fruit("Brighter in color"));
		foodList.add(new Vegetable());
		foodList.add(new Meat());
		foodList.add(new Fish());
		
		for (Food f : foodList)
		{
			f.isEdible();
			f.printFoodType();
			System.out.println();
		}
	}
	
	
}
