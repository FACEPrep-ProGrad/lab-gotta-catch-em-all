package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR","64");
			// Create the object for Bulbasaur class and use getters to retrieve the values	
		    System.out.println("Pokemon Name: "+bulbasaur.getPokemonName());
		    System.out.println("Pokemon Number: "+bulbasaur.getPokemonNumber());
		    System.out.println("characteristics: "+bulbasaur.getCharacteristics()); 
		    System.out.println("type: "+bulbasaur.getType());
		    System.out.println("evoultion: "+bulbasaur.getEvolution());
		    System.out.println("baseExp: "+bulbasaur.getBaseExp());
		    
			/*	  pokemonName = Bulbasaur
//pokemonNumber = 001
//characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."
//type = "POISON"
//evolution = "IVYSAUR"
//baseExp = "64" 
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message1",//getter);
			request.setAttribute("character1", //getter);
			request.setAttribute("type1",//getter;
			request.setAttribute("evolution1", //getter);
			request.setAttribute("baseExp1", //getter);*/
		}

		if (value2 != null) {
			//pokemonName = Charizard
			//pokemonNumber = 006
			//characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers."
			//type = "FIRE"
			//evolution = "CHARMELEON"
			//baseExp = "240"
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard charizard = new Charizard("Charizard",006,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON","240");
			System.out.println("Pokemon Name: "+charizard.getPokemonName());
		    System.out.println("Pokemon Number: "+charizard.getPokemonNumber());
		    System.out.println("characteristics: "+charizard.getCharacteristics()); 
		    System.out.println("type: "+charizard.getType());
		    System.out.println("evoultion: "+charizard.getEvolution());
		    System.out.println("baseExp: "+charizard.getBaseExp());		
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message2",//getter);
			request.setAttribute("character2", //getter);
			request.setAttribute("type2",//getter;
			request.setAttribute("evolution2", //getter);
			request.setAttribute("baseExp2", //getter);*/
		}

		if (value3 != null) {
			//pokemonName = Dragonite
					//pokemonNumber = 149
					//characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism."
					//type = "DRAGON"
					//evolution = "DRATINI"
					//baseExp = "270"
			// Create the object for Dragonite class and use getters to retrieve the values	
			Dragonite dragonite = new Dragonite("Dragonite",149,"Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.","DRAGON","DRATINI","270");
			System.out.println("Pokemon Name: "+dragonite.getPokemonName());
		    System.out.println("Pokemon Number: "+dragonite.getPokemonNumber());
		    System.out.println("characteristics: "+dragonite.getCharacteristics()); 
		    System.out.println("type: "+dragonite.getType());
		    System.out.println("evoultion: "+dragonite.getEvolution());
		    System.out.println("baseExp: "+dragonite.getBaseExp());
		    
			
			msg = "<center>" +dragonite.getPokemonName() + "  #" + dragonite.getPokemonNumber();
			//request.setAttribute("message3",dragonite.);
			request.setAttribute("character3",dragonite.getCharacteristics());
			request.setAttribute("type3",dragonite.getType());
			request.setAttribute("evolution3", dragonite.getEvolution());
			request.setAttribute("baseExp3", dragonite.getBaseExp());
		}
		if (value4 != null) {
			Mew mew = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.","PSYCHIC","NONE","64");
			System.out.println("Pokemon Name: "+mew.getPokemonName());
		    System.out.println("Pokemon Number: "+mew.getPokemonNumber());
		    System.out.println("characteristics: "+mew.getCharacteristics()); 
		    System.out.println("type: "+mew.getType());
		    System.out.println("evoultion: "+mew.getEvolution());
		    System.out.println("baseExp: "+mew.getBaseExp());
			//pokemonNumber = 151
			//type = "PSYCHIC"
			//evolution = "NONE"
			//baseExp = "64" 
			// Create the object for Mew class and use getters to retrieve the values	
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message4",//getter);
			request.setAttribute("character4", //getter);
			request.setAttribute("type4",//getter;
			request.setAttribute("evolution4", //getter);
			request.setAttribute("baseExp4", //getter);*/
		}

		if (value5 != null) {
			Pikachu pikachu = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.","ELECTRIC","RAICHU","112");
			System.out.println("Pokemon Name: "+pikachu.getPokemonName());
		    System.out.println("Pokemon Number: "+pikachu.getPokemonNumber());
		    System.out.println("characteristics: "+pikachu.getCharacteristics()); 
		    System.out.println("type: "+pikachu.getType());
		    System.out.println("evoultion: "+pikachu.getEvolution());
		    System.out.println("baseExp: "+pikachu.getBaseExp());
			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message5",//getter);
			request.setAttribute("character5", //getter);
			request.setAttribute("type5",//getter;
			request.setAttribute("evolution5", //getter);
			request.setAttribute("baseExp5", //getter);*/

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
