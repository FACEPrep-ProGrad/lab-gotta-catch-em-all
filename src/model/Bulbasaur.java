package model;




//Bulbasaur must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//Use the predefined values given below as constructor arguments 
//pokemonName = Bulbasaur
//pokemonNumber = 001
//characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."
//type = "POISON"
//evolution = "IVYSAUR"
//baseExp = "64" 

//child class
public class Bulbasaur  extends Pokemon
{
	
	//arguments
	String name;
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	
//getter and setter
	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEvolution() {
		return evolution;
	}

	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}

	public String getBaseExp() {
		return baseExp;
	}

	public void setBaseExp(String baseExp) 
	{
		this.baseExp = baseExp;
	}
	
	//constructor
	public Bulbasaur(String pokemonName, int pokemonNumber, String characteristics, String type,String evolution,String baseExp) 
	{
		super(pokemonName, pokemonNumber);
		this.characteristics=characteristics;
		this.type=type;
		this.evolution=evolution;
		this.baseExp=baseExp;
	}
}


