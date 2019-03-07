package pokemon.view;
import java.awt.event.ActionListener;
import java.util.function.BooleanSupplier;

import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import javax.swing.*;
import pokemon.controller.*;

public class PokedexFrame extends JFrame
{

	public static void main(String args[])
	{
		JFrame frame = new JFrame("PokemonFrame");
				frame.setTitle("PokemonFrame");
		frame.setSize(300, 200);;
	}
}
