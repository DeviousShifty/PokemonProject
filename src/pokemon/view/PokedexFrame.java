package pokemon.view;
import java.awt.event.ActionListener;
import java.util.function.BooleanSupplier;

import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import javax.swing.*;
import pokemon.controller.*;
import java.awt.BorderLayout;
import java.awt.List;

public class PokedexFrame extends JFrame
{
	public PokedexFrame() {
		
		JButton SaveButton = new JButton("SaveButton");
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(SaveButton, BorderLayout.SOUTH);
		
		List list = new List();
		getContentPane().add(list, BorderLayout.CENTER);
	}

	public static void main(String args[])
	{
		JFrame frame = new JFrame("PokemonFrame");
				frame.setTitle("PokemonFrame");
		frame.setSize(300, 200);;
	}
}
