package pokemon.controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pokemon.view.PokedexFrame;
import pokemon.model.*;

public class PokedexController 
{
private ArrayList<Pokemon> pokemonList;
private PokedexFrame appFrame;

public PokedexController()
{
	pokemonList = new ArrayList<Pokemon>();
	addPokemon();
	appFrame = new PokedexFrame(this);
}
private void addPokemon()
{
	pokemonList.add(Rayquaza());
	pokemonList.add(new Magnemite());
}
public void start()
{
	
}
public ArrayList<Pokemon> getPokemonList()
{
	
}
public void updatePokemon(int index, String [] data)
{
	if(data.length == 5)
	{
		Pokemon current = pokemonList.get(index);
		current.setAttackPoints(Integer.parseInt(data[0]));
		current.setEnhancementModifier(Double.parseDouble(data[1]));
		current.setHealthPoints(Integer.parseInt(data[2]));
		current.setName(data[3]);
		current.setCanEvolve(Boolean.parseBoolean(data[4]));
	}
}


public String[] buildPokedexText()
{
String [] names = new String [pokemonList.size()];

for(int index = 0; index < pokemonList.size(); index++)

{
names[index] = pokemonList.get(index).getName();
}
return names;
	}
}
