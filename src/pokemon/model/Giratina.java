package pokemon.model;

public class Giratina extends Pokemon implements Ghosty
{
public Giratina(int number, String name)
{
	super(number, name);
}
	
	public void boo()
	{
		System.out.println("Boo XD");
	}
	public int ghostyLevel()
	{
		return 12345;
	}

}
