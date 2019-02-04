package pokemon.model;

public class Rayquaza extends Pokemon implements Ghosty
{
	public Rayquaza(int number, String name)
	{
		super(number, name);
	}
	public void boo()
	{
		System.out.println("Get Booed Dummy" + this.getAttackPoints());
	}
	
	public int ghostyLevel()
	{
		return this.getHealthPoints();
	}
}
