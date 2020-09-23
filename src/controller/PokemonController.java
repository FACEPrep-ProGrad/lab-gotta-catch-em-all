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
			Bulbasaur bal = new Bulbasaur();
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			  
			msg = "<center>" + bal.getPokemonName() + "  #" +bal.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bal.getCharacteristics());
			request.setAttribute("type1",bal.getType());
			request.setAttribute("evolution1", bal.getEvolution());
			request.setAttribute("baseExp1", bal.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard bal = new Charizard();
			
			msg = "<center>" + bal.getPokemonName() + "  #" +bal.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bal.getCharacteristics());
			request.setAttribute("type1",bal.getType());
			request.setAttribute("evolution1", bal.getEvolution());
			request.setAttribute("baseExp1", bal.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
			Dragonite bal = new Dragonite();
			msg = "<center>" + bal.getPokemonName() + "  #" +bal.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bal.getCharacteristics());
			request.setAttribute("type1",bal.getType());
			request.setAttribute("evolution1", bal.getEvolution());
			request.setAttribute("baseExp1", bal.getBaseExp());
		}
		if (value4 != null) {
			Mew bal = new Mew();
			// Create the object for Mew class and use getters to retrieve the values	
			msg = "<center>" + bal.getPokemonName() + "  #" +bal.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bal.getCharacteristics());
			request.setAttribute("type1",bal.getType());
			request.setAttribute("evolution1", bal.getEvolution());
			request.setAttribute("baseExp1", bal.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			Pikachu bal = new Pikachu();
			msg = "<center>" + bal.getPokemonName() + "  #" +bal.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bal.getCharacteristics());
			request.setAttribute("type1",bal.getType());
			request.setAttribute("evolution1", bal.getEvolution());
			request.setAttribute("baseExp1", bal.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
