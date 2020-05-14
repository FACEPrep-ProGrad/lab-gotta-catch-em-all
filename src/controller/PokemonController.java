package controller;

import java.io.IOException;
import model.*;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			
			 Bulbasaur bulbasaur = new Bulbasaur(null, 0, null, null, null, null);
			 bulbasaur.getCharacteristics();

			// Create the object for Bulbasaur class and use getters to retrieve the values	
			  
			msg = "<center>" + bulbasaur.getName() + "  #" + bulbasaur.getNumber();
			request.setAttribute("message2",bulbasaur.getNumber());
			request.setAttribute("character2", bulbasaur.getCharacteristics());
			request.setAttribute("type2",bulbasaur.getType());
			request.setAttribute("evolution2", bulbasaur.getEvolution());
			request.setAttribute("baseExp2", bulbasaur.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard charizard  = new Charizard(null, 0, null, null, null, null);
			  
			msg = "<center>" + charizard.getName() + "  #" + charizard.getNumber();
			request.setAttribute("message2",charizard.getNumber());
			request.setAttribute("character2",charizard.getCharacteristics());
			request.setAttribute("type2",charizard.getType());
			request.setAttribute("evolution2", charizard.getEvolution());
			request.setAttribute("baseExp2", charizard.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
			Dragonite dragonite  = new Dragonite(null, 0, null, null, null, null);
				  
			msg = "<center>" + dragonite.getName() + "  #" + dragonite.getNumber();
			request.setAttribute("message2",dragonite.getNumber());
			request.setAttribute("character2", dragonite.getCharacteristics());
			request.setAttribute("type2",dragonite.getType());
			request.setAttribute("evolution2", dragonite.getEvolution());
			request.setAttribute("baseExp2", dragonite.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew mew  = new Mew(null, 0, null, null, null, null);
			  
			msg = "<center>" +  mew.getName() + "  #" + mew.getNumber();
			request.setAttribute("message2",mew.getNumber());
			request.setAttribute("character2", mew.getCharacteristics());
			request.setAttribute("type2",mew.getType());
			request.setAttribute("evolution2", mew.getEvolution());
			request.setAttribute("baseExp2", mew.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values
			Pikachu pikachu=new Pikachu(null, 0, null, null, null, null);
			  
			msg = "<center>" + pikachu.getName() + "  #" + pikachu.getNumber();
			request.setAttribute("message2",pikachu.getNumber());
			request.setAttribute("character2", pikachu.getCharacteristics());
			request.setAttribute("type2",pikachu.getType());
			request.setAttribute("evolution2", pikachu.getEvolution());
			request.setAttribute("baseExp2", pikachu.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
