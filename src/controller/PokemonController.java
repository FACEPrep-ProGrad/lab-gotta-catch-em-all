package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

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

		

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur b=new Bulbasaur();
			
			String msg1 = "<center>" + b.getPokemonName() + "  #" + b.getPokemonNumber();
			request.setAttribute("message1",msg1);
			request.setAttribute("character1", b.getCharacteristics());
			request.setAttribute("type1",b.getType());
			request.setAttribute("evolution1", b.getEvolution());
			request.setAttribute("baseExp1", b.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard c=new Charizard();
				  
			String msg2 = "<center>" + c.getPokemonName() + "  #" + c.getPokemonNumber();
			request.setAttribute("message2",msg2);
			request.setAttribute("character2", c.getCharacteristics());
			request.setAttribute("type2",c.getType());
			request.setAttribute("evolution2", c.getEvolution());
			request.setAttribute("baseExp2", c.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
			Dragonite d=new Dragonite();
				  
			String msg3 = "<center>" + d.getPokemonName() + "  #" + d.getPokemonNumber();
			request.setAttribute("message3",msg3);
			request.setAttribute("character3", d.getCharacteristics());
			request.setAttribute("type3",d.getType());
			request.setAttribute("evolution2", d.getEvolution());
			request.setAttribute("baseExp2", d.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew m=new Mew();
			
			String msg4 = "<center>" + m.getPokemonName() + "  #" + m.getPokemonNumber();
			request.setAttribute("message4",msg4);
			request.setAttribute("character4", m.getCharacteristics());
			request.setAttribute("type4",m.getType());
			request.setAttribute("evolution4", m.getEvolution());
			request.setAttribute("baseExp4", m.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	

			Pikachu p=new Pikachu();
			
			String msg5 = "<center>" + p.getPokemonName() + "  #" + p.getPokemonNumber();
			request.setAttribute("message5",msg5);
			request.setAttribute("character5", p.getCharacteristics());
			request.setAttribute("type5",p.getType());
			request.setAttribute("evolution5", p.getEvolution());
			request.setAttribute("baseExp5", p.getBaseExp());
		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
