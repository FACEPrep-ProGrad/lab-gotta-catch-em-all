package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

public class Pokemon{
	private static String PokemonName;
	private static int pokemonNumber;
	public Pokemon(String pokemonName, int pokemonNumber) {
		super();
		PokemonName = pokemonName;
		this.pokemonNumber = pokemonNumber;
	}
	
	public static String getPokemonName() {
		return PokemonName;
	}
	public void setPokemonName(String pokemonName) {
		PokemonName = pokemonName;
	}
	public static int getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	
}