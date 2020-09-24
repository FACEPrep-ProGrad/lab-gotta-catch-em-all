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
			
			Bulbasaur bulbasaur = new Bulbasaur(msg, 0, msg, msg, msg, msg);
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	  
			
			msg = "<center>" + bulbasaur.getPokemonName() + "  #" + bulbasaur.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bulbasaur.getCharacteristics());
			request.setAttribute("type1",bulbasaur.getType());
			request.setAttribute("evolution1", bulbasaur.getEvolution());
			request.setAttribute("baseExp1", bulbasaur.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			
			Charizard charizard = new Charizard(msg, 0, msg, msg, msg, msg);
			
			msg = "<center>" +charizard.getPokemonName() + "  #" + charizard.getPokemonNumber();
			request.setAttribute("message2",msg);
			request.setAttribute("character2", charizard.getCharacteristics());
			request.setAttribute("type2",charizard.getType());
			request.setAttribute("evolution2", charizard.getEvolution());
			request.setAttribute("baseExp2", charizard.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	

			Dragonite dragonite = new Dragonite(msg, 0, msg, msg, msg, msg);
			
			msg = "<center>" + dragonite.getPokemonName() + "  #" + dragonite.getPokemonNumber();
			request.setAttribute("message3",msg);
			request.setAttribute("character3", dragonite.getCharacteristics());
			request.setAttribute("type3",dragonite.getType());
			request.setAttribute("evolution3", dragonite.getEvolution());
			request.setAttribute("baseExp3", dragonite.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			
			Mew mew = new Mew(msg, 0, msg, msg, msg, msg);
			msg = "<center>" + mew.getPokemonName()+ "  #" + mew.getPokemonNumber();
			request.setAttribute("message4",msg);
			request.setAttribute("character4", mew.getCharacteristics());
			request.setAttribute("type4",mew.getType());
			request.setAttribute("evolution4", mew.getEvolution());
			request.setAttribute("baseExp4", mew.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
			Pikachu pikachu = new Pikachu(msg, 0, msg, msg, msg, msg);  
			msg = "<center>" + pikachu.getPokemonName() + "  #" + pikachu.getPokemonNumber();
			request.setAttribute("message5",msg);
			request.setAttribute("character5", pikachu.getCharacteristics());
			request.setAttribute("type5",pikachu.getType());
			request.setAttribute("evolution5", pikachu.getEvolution());
			request.setAttribute("baseExp5", pikachu.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
