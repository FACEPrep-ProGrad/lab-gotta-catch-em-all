package model;




public class Charizard extends Pokemon{
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	
	
	
	public Charizard(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) {
		super(pokemonName, pokemonNumber);
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp = baseExp;
	}
	
	public Charizard() {
		super ("Charizard",006);
		this.characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights.With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		this.type = "FIRE";
		this.evolution =  "CHARMELEON";
		this.baseExp="240" ;
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





















