package model;


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
