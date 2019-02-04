package pokemon.model;

public class Groudon extends Pokemon implements Ghosty
{
	public Groudon(int number, String name)
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
