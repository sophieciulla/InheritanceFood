
public abstract class Animal extends Food
{
	protected String typeOfAnimal;
	protected Animal() 
	{
		System.out.println("I am a/an " + typeOfAnimal);
	}
	protected void hasABody()
	{
		System.out.println("I have to have some sort of a body");
	}
	protected void mustBeCooked()
	{
		System.out.println("I must be cooked");
	}

}
