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
import model.Pokemon;
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
			String pokemonName = "Bulbasaur";
			int pokemonNumber = 001;
			String characteristics= "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
			String type = "POISON";
			String evolution = "IVYSAUR";
			String baseExp = "64";
			Bulbasaur bulbasaur=new  Bulbasaur(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + bulbasaur.getPokemonName()+ "  #" + bulbasaur.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1",bulbasaur.getCharacteristics() );
			request.setAttribute("type1",bulbasaur.getType());
			request.setAttribute("evolution1",bulbasaur.getEvolution());
			request.setAttribute("baseExp1",bulbasaur.getBaseExp());
		}


		if (value2 != null) {
			String pokemonName = "Charizard";
			int pokemonNumber = 006;
			String characteristics= "Charizard is fit and strong and has the ability to soar up to ridiculous heights.\r\n"
					+ "With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
			String type = "FIRE";
			String evolution = "CHARMELEON";
			String baseExp = "240";
			Charizard charizard=new  Charizard(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + charizard.getPokemonName()+ "  #" + charizard.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1",charizard.getCharacteristics() );
			request.setAttribute("type1",charizard.getType());
			request.setAttribute("evolution1",charizard.getEvolution());
			request.setAttribute("baseExp1",charizard.getBaseExp());
		}

		if (value3 != null) {
			String pokemonName = "Dragonite";
			int pokemonNumber = 149;
			String characteristics= "Dragonite is capable of flying faster than the speed of sound. \r\n"
					+ "It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
			String type = "DRAGON";
			String evolution = "DRATINI";
			String baseExp = "270";
			Dragonite dragonite=new  Dragonite(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + dragonite.getPokemonName()+ "  #" + dragonite.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1",dragonite.getCharacteristics() );
			request.setAttribute("type1",dragonite.getType());
			request.setAttribute("evolution1",dragonite.getEvolution());
			request.setAttribute("baseExp1",dragonite.getBaseExp());
			
		}
		if (value4 != null) {

			String pokemonName = "Mew";
			int pokemonNumber = 151;
			String characteristics= "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. \r\n"
					+ "Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
			String type = "PSYCHIC";
			String evolution = "NONE";
			String baseExp = "64";
			Mew mew=new Mew(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + mew.getPokemonName()+ "  #" + mew.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1",mew.getCharacteristics() );
			request.setAttribute("type1",mew.getType());
			request.setAttribute("evolution1",mew.getEvolution());
			request.setAttribute("baseExp1",mew.getBaseExp());
		}

		if (value5 != null) {

			String pokemonName = "Pikachu";
			int pokemonNumber = 25;
			String characteristics= "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. \r\n"
					+ "Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
			String type = "ELECTRIC";
			String evolution = "RAICHU";
			String baseExp = "112";
			Pikachu pikachu=new  Pikachu(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp );
			msg = "<center>" + pikachu.getPokemonName()+ "  #" + pikachu.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1",pikachu.getCharacteristics() );
			request.setAttribute("type1",pikachu.getType());
			request.setAttribute("evolution1",pikachu.getEvolution());
			request.setAttribute("baseExp1",pikachu.getBaseExp());
		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}