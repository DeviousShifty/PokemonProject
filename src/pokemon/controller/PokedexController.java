package pokemon.controller;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;

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
	pokemonList.add(new Giratina());
	pokemonList.add(new Rayquaza());
}
public void start()
{
	
}
public ArrayList<Pokemon> getPokemonList()
{
	return pokemonList;
	
}
public boolean isInt(String text)
{
	try
	{
		Integer.parseInt(text);
		return true;
	}
	catch(NumberFormatException error)
	{
		JOptionPane.showInputDialog(appFrame, "You need to use a double value");
	}
	return false;
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
public Object getFrame() {
	// TODO Auto-generated method stub
	return null;
}
public BooleanSupplier isDouble(String string) {
	// TODO Auto-generated method stub
	return null;
}

}
