package pokemon.controller;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;

import javax.swing.JOptionPane;
import pokemon.view.PokedexFrame;
import sun.util.logging.PlatformLogger;
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
	pokemonList.add(new Giratina(0,null));
	pokemonList.add(new Rayquaza(0,null));
	pokemonList.add(new Ditto(0, null));
	//pokemonList.add(new Arceus(0, null));
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
		JOptionPane.showInputDialog(appFrame, "You need to use a double value"); //Change input to message if incorrect
	}
	return false;
}

public void updatePokemon(int index, String [] data)

public String [] getPokeData(int index)
{
	String [] data = new String [6];
	Pokemon current = pokemonList.get(index);
	data[0] = current.getAttackPoints()+ "";
	data [1] = current.getEnhancementModifier() + "";
	data [2] = current.getHealthPoints()+ "";
	data [3] = current.getName() + "";
	data [4] = current.isCanEvolve() + "";
	data[5] = current.getNumber() + "";
	return data;
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

private void processException(Throwable e) 
{
	if(eventLog. isLoggable(PlatformLogger.Level.FINE))
	{
		eventLog.fine("Processing exeption: "+ e);
	}
	getUncaughtExceptionHandler().uncaughtException(this, e);
}
}
