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
	
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		
		numberField = new JTextField("0");
		nameField_1 = new JTextField("0");
		evolveField_1 = new JTextField("0");
		enhancementField_1 = new JTextField("0");
		healthField_1 = new JTextField("0");
		
		numberLabel = new JLabel("This pokemon number is");
		healthLabel = new JLabel("This pokemon health is");
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel ("This pokemon attack level is");
		enhanceLabel = new JLabel ("this pokemon enhancement level is");
		nameLabel = new JLabel ("My name is");
		imageLabel = new JLabel ("pokemon goes here");
		
		changeButton = new JButton ("Click here to change the pokevalues");
		pokedexDropdown = new JComboBox<String>(); //stub
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		SpringLayout appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.WEST, nameField_1, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField_1, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, evolveField_1, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, healthField_1, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, healthField_1, -302, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, enhancementField_1, -29, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 123, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -83, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField_1, 136, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField_1, 82, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField_1, 28, SpringLayout.NORTH, this);
	this.setLayout(appLayout);
	this.add(pokedexDropdown);
	this.add(healthField);
	this.add(evolveField_1);
	this.add(enhancementField_1);
	this.add(attackField);
	this.add(nameField_1);
	
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
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				
			}
		});
	}
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>((String[]) app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
}
