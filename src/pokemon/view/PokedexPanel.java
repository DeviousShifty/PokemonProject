package pokemon.view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pokemon.controller.PokedexController;
import javax.swing.SpringLayout;

public class PokedexPanel extends JPanel
{
	private PokedexController app;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JComboBox<String> pokedexDropdown;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField nameField_1;
	private JTextField evolveField;
	private JTextField evolveField_1;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField enhancementField_1;
	private JTextField healthField;
	private JTextField healthField_1;
	
	private JLabel numberLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	private JLabel nameLabel;
	private JButton saveButton;
	
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		
		this.appLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/mega rayquaza.png"));
		
		numberField = new JTextField("0");
		nameField_1 = new JTextField("0");
		evolveField_1 = new JTextField("0");
		enhancementField_1 = new JTextField("0");
		healthField_1 = new JTextField("0");
		
		saveButton = new JButton("Click to Savius Maximus");
		numberLabel = new JLabel("This pokemon number is");
		healthLabel = new JLabel("This pokemon health is");
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel ("This pokemon attack level is");
		enhanceLabel = new JLabel ("this pokemon enhancement level is");
		nameLabel = new JLabel ("My name is");
		imageLabel = new JLabel ("pokemon goes here", pokemonIcon, JLabel.CENTER);
		
		changeButton = new JButton ("Click here to change the pokevalues");
		pokedexDropdown = new JComboBox<String>(); //stub
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		SpringLayout appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -302, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, enhancementField, -29, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 123, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -83, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 136, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 82, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 28, SpringLayout.NORTH, this);
	this.setLayout(appLayout);
	this.add(pokedexDropdown);
	this.add(healthField);
	this.add(evolveField);
	this.add(enhancementField);
	this.add(attackField);
	this.add(nameField);
	this.add(saveButton);
	this.add(changeButton);
	
	imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
	imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	private void setupLayout()
	{
		this.appLayout = new SpringLayout();
		numberField = new JTextField("0");
		nameField = new JTextField("My Pokename");
		evolveField = new JTextField("false");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		}
	private void setupListeners()
	{
		changeButton.addActionListener((ActionListener) new ActionListener() 
		{
			public void actionPerformed(ActionEvent selection)
			{
				sendDataToController();
			}
		
	});
		
	pokedexDropdown.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent selection)
		{
			String name = pokedexDropdown.getSelectedItem().toString();
			updateFields(pokedexDropdown.getSelectedItem());
			changeImageDisplay(name);
		
		}

		private void updateFields(Object selectedItem) {
			// TODO Auto-generated method stub
			
		}
	});
	
	
	saveButton.addActionListener((ActionListener) new ActionListener()
			{
		public void actionPerformed(ActionEvent selection)
		{
			sendDataToController();
		}
			});
	}
	

	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>((String[]) app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		//if(app.isInt(attackField.getText())&& app.isDouble(enhancementField.getText())&& app.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			
			app.updatePokemon(index, data);
		}
	}
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "mega rayquaza";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase()+ extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
	{
	pokedexDropdown.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent selection)
		{
			String name = pokedexDropdown.getSelectedItem().toString();
			changeImageDisplay(name);
		}
			});
}
	private void updateFields(int index)
	{
		String [] data = app.getPokeData(index);
		
		attackField.setText(data[0]);
		enhancementField.setText(data[1]);
		healthField.setText(data[2]);
		nameField.setText(data[3]);
		evolveField.setText(data[4]);
		numberField.setText(data[5]);
	}
	
	
	
}