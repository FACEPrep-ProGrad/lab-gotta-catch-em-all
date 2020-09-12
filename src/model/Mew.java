package model;




public class Mew extends Pokemon{
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	
	
	
	
	
	public Mew(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemonNumber);
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp = baseExp;
	}
		
		
		public Mew() {
			super ("Mew",151);
			this.characteristics ="Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
			this.type = "PSYCHIC";
			this.evolution =  "NONE";
			this.baseExp= "64" ;
		
	}
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
	
	
}