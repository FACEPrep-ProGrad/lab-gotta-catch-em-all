package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

//parent class
 public  class Pokemon
{
	 //arguments
	  int pokemonNumber;
	  String pokemonName;
	  
	  
	//getter and setter
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public int getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	
	//constructor
	Pokemon(String pokemonName,int pokemonNumber)
	{
		this.pokemonName=pokemonName;
		this.pokemonNumber=pokemonNumber;
		
	}
}
