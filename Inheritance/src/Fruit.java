
public class Fruit extends Plant 
{
	protected String typeOfFood = " fruit";
	protected Fruit(String c) 
	{
		color = c;
	}
	@Override
	protected void isEdible()
	{
		System.out.println("Do you research before you eat the berries from the woods...");
	}
	protected void flowers()
	{
		System.out.println("Along with fruit, I also grow flowers! ");
	}

}
