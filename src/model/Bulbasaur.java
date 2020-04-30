package model;


//PROGRESSION - 2 
//Go to JAVA Resouces - src/model and create a child class called Bulbasaur inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Bulbasaur must extend the Pokemon classq
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//Use the predefined values given below as constructor arguments 
//pokemonName = Bulbasaur
//pokemonNumber = 001
//characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."
//type = "POISON"
//evolution = "IVYSAUR"
//baseExp = "64" `
public class Bulbasaur extends Pokemon{
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	int pokemonNumber = 001;
	
	
	
	
	public Bulbasaur(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemonNumber);
		this.pokemonName =pokemonName;
		this.pokemonNumber = pokemonNumber;
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp = baseExp;
	}
	public String getCharacteristics() {
		return "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public String getType() {
		return "POISON";
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEvolution() {
		return "IVYSAUR";
	}
	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	public String getBaseExp() {
		return "64";
	}
	public void setBaseExp(String baseExp) {
		this.baseExp = baseExp;
	}
	
}


