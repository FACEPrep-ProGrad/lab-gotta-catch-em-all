package model;


//PROGRESSION - 4
//Go to JAVA Resouces - src/model and create a child class called Dragonite inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Dragonite must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Dragonite
//pokemonNumber = 149
//characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pok�mon with human-like intelligence. It shows signs of altruism."
//type = "DRAGON"
//evolution = "DRATINI"
//baseExp = "270" 
public class Dragonite extends Pokemon{
	String characteristics; 
	String type;
	String evolution;
	int baseExp;
	//getters for characteristics
	public String getCharacteristics() {
		return this.characteristics;
	}
	//setters for characteristics
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	//getter for type
	public String getType() {
		return this.type;
	}
	//setter for type
	public void setType(String type) {
		this.type = type;
	}
	//getter of evolution
	public String getEvolution() {
		return this.evolution;
	}
	//setter of evolution
	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	//getter for baseExp
	public int getBaseExp() {
		return this.baseExp;
	}
	//setter for baseExp
	public void setBaseExp(int baseExp) {
		this.baseExp = baseExp;
	}
	public Dragonite(String pokemonName,int pokemonNumber,String characteristics,String type,String evolution,int baseExp) {
		super(pokemonName,pokemonNumber);
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp =baseExp;
	}
}