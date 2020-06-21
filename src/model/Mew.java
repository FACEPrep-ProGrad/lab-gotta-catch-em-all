package model;

//PROGRESSION - 5
//Go to JAVA Resouces - src/model and create a child class called Mew inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Mew must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Mew
//pokemonNumber = 151
//characteristics = "Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
//type = "PSYCHIC"
//evolution = "NONE"
//baseExp = "64" 
public class Mew extends Pokemon{
	String characteristics; 
	String type;
	String evolution;
	int baseExp;
	//getter for characteristics
	public String getCharacteristics() {
		return this.characteristics;
	}
	//setter for characteristics
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	//getter for type
	public String  getType() {
		return this.type;
	}
	//setter for type
	public void setType(String type) {
		this.type = type;
	}
	//get evolution
	public String getEvolution() {
		return this.evolution;
	}
	//set evolution
	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	//get baseExp
	public int getBaseExp() {
		return this.baseExp;
	}
	//set baseExp
	public void setBaseExp(int baseExp) {
		this.baseExp = baseExp;
	}
	//constructor
	public Mew(String pokemonName,int pokemonNumber,String characteristics,String type,String evolution,int baseExp) {
		super(pokemonName , pokemonNumber);
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp = baseExp;
	}
	
	
	
	
	
	
	
	
	
}