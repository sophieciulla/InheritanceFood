
public class Meat extends Animal
{
//	 typeOfAnimal = "meat";
	
	protected Meat() 
	{
		System.out.println("Don't eat me if you're a vegetarian");
	}
	
	@Override
	protected void isEdible()
	{
		System.out.println("Just don't eat undercooked chicken");
	}

}
