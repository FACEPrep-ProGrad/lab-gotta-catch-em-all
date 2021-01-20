package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

public class Pokemon{
	private String pokemonName;
	private int pokemonNumber;
	
	public Pokemon(String pokemonName,int pokemonNumber)
	{
		this.pokemonName=pokemonName;
		this.pokemonNumber=pokemonNumber;
	}
	/**
	 * @return the pokemonName
	 */
	public String getPokemonName() {
		return pokemonName;
	}
	/**
	 * @param pokemonName the pokemonName to set
	 */
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	/**
	 * @return the pokemonNumber
	 */
	public int getPokemonNumber() {
		return pokemonNumber;
	}
	/**
	 * @param pokemonNumber the pokemonNumber to set
	 */
	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	
}