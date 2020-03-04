package controller;
import model.*;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PokemonController
 */
@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/* Do not modify these lines */
		String value1 = request.getParameter("card1"); // refers to bulbasaur
		String value2 = request.getParameter("card2"); // refers to charizard
		String value3 = request.getParameter("card3"); // refers to dragonite
		String value4 = request.getParameter("card4"); // refers to Mew
		String value5 = request.getParameter("card5"); // refers to pikachu

		String msg = "";

		// 1st card
		if (value1 != null) 
		{
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur b=new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
					"POISON","IVYSAUR","64");
			  
			msg = "<center>" + b.getPokemonName() + "  #" + b.getPokemonNumber();
			request.setAttribute("message1",b.getPokemonNumber());
			request.setAttribute("character1", b.getCharacteristics());
			request.setAttribute("type1",b.getType());
			request.setAttribute("evolution1",b.getEvolution());
			request.setAttribute("baseExp1", b.getBaseExp());
		}

		
		// 2nd card
		if (value2 != null)
		{
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard c= new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
					"FIRE","CHARMELEON","240"); 
			
			
				  
			msg = "<center>" + c.getPokemonName() + "  #" +  c.getPokemonNumber();
			request.setAttribute("message2", c.getPokemonNumber());
			request.setAttribute("character2",c.getCharacteristics());
			request.setAttribute("type2",c.getType());
			request.setAttribute("evolution2", c.getEvolution());
			request.setAttribute("baseExp2",c.getBaseExp());
		}

		
		// 3rd card
		if (value3 != null) 
		{

			// Create the object for Dragonite class and use getters to retrieve the values	
			
			 Dragonite d=new  Dragonite(" Dragonite",149,"Dragonite is capable of flying faster than the speed of sound.It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.", "DRAGON","DRATINI","270"); 
				  
			msg = "<center>" + d.getPokemonName() + "  #" +  d.getPokemonNumber();
			request.setAttribute("message3",d.getPokemonNumber());
			request.setAttribute("character3", d.getCharacteristics());
			request.setAttribute("type3",d.getType());
			request.setAttribute("evolution3",d.getEvolution());
			request.setAttribute("baseExp3", d.getBaseExp());
		}
		
		// 4th card
		
		if (value4 != null) 
		{

			// Create the object for Mew class and use getters to retrieve the values	
			Mew m=new Mew("Mew",151,"Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"PSYCHIC","NONE","64");
			  
			msg = "<center>" + m.getPokemonName() + "  #" +  m.getPokemonNumber();
			request.setAttribute("message4",m.getPokemonNumber());
			request.setAttribute("character4",m.getCharacteristics());
			request.setAttribute("type4",m.getType());
			request.setAttribute("evolution4", m.getEvolution());
			request.setAttribute("baseExp4", m.getBaseExp());
		}

		// 5th card
		if (value5 != null) 
		{

			// Create the object for Pikachu class and use getters to retrieve the values	
			Pikachu p=new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.",
					"ELECTRIC","RAICHU","112");

			msg = "<center>" + p.getPokemonName() + "  #" +  p.getPokemonNumber();
			request.setAttribute("message5",p.getPokemonNumber());
			request.setAttribute("character5",p.getCharacteristics());
			request.setAttribute("type5",p.getType());
			request.setAttribute("evolution5",p.getEvolution());
			request.setAttribute("baseExp5", p.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}