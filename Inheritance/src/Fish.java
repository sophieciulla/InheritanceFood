
public class Fish extends Animal
{
	
	protected String typeOfAnimal = "fish";
	protected Fish() 
	{
		System.out.println("I breathe water");
	}
	
	
	protected void isEdible()
	{
		System.out.println("Make sure your pufferfish is prepared right");
	}
	@Override 
	protected void mustBeCooked()
	{
		System.out.println("Uncooked fish is fine as long as it's a high quality grade!");
	}

}
