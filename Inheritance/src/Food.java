
abstract class Food 
{
	protected String color;
	protected String typeOfFood;
	
	protected abstract void isEdible();
	
	protected void printFoodType()
	{
		System.out.println("I am a " + typeOfFood);
	}
	

	

}
