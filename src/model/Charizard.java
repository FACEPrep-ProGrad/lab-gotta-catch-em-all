package model;



//Charizard must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Charizard
//pokemonNumber = 006
//characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers."
//type = "FIRE"
//evolution = "CHARMELEON"
//baseExp = "240" 

//child class
public class Charizard  extends Pokemon
{
	
	//arguments
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

	public void setBaseExp(String baseExp) {
		this.baseExp = baseExp;
	}
	
	
	//constructor
	public Charizard (String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp)
	{
		super(pokemonName, pokemonNumber);
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp = baseExp;
	}
	
}