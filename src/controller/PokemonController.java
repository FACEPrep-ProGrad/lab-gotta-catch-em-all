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

		String msg = "";

		if (value1 != null) {
			int p_number =001;
			String name = "Bulbasaur";
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur b_saur = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/poison-type pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter pokémon in the Kanto region.",
					"POISON","IVYSAUR","64");
			msg = "<center>" + name + "  #" + p_number;
			
			request.setAttribute("message1",b_saur.getPokemonNumber());
			request.setAttribute("character1", b_saur.getCharacteristics());
			request.setAttribute("type1",b_saur.getType());
			request.setAttribute("evolution1", b_saur.getEvolution());
			request.setAttribute("baseExp1", b_saur.getBaseExp());
		}

		if (value2 != null) {
			int p_num =006;
			String name = "Charizard";
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard Charizard = new Charizard("Charizard",006,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
					"FIRE","CHARMELEON","240");
				  
			msg = "<center>" + name + "  #" + p_num;
			
			request.setAttribute("message2",Charizard.getPokemonNumber());
			request.setAttribute("character2", Charizard.getCharacteristics());
			request.setAttribute("type2",Charizard.getType());
			request.setAttribute("evolution2", Charizard.getEvolution());
			request.setAttribute("baseExp2", Charizard.getBaseExp());
		}

		if (value3 != null) {
			int p_num =149;
			String name = "Dragonite";
			// Create the object for Dragonite class and use getters to retrieve the values	

			Dragonite drag=new  Dragonite(" Dragonite",149,"Dragonite is capable of flying faster than the speed of sound.It is a kindhearted pokémon with human-like intelligence. It shows signs of altruism.", "DRAGON","DRATINI","270"); 
			msg = "<center>" + name + "  #" + p_num; 
			
			request.setAttribute("message3",drag.getPokemonNumber());
			request.setAttribute("character3", drag.getCharacteristics());
			request.setAttribute("type3",drag.getType());
			request.setAttribute("evolution3", drag.getEvolution());
			request.setAttribute("baseExp3", drag.getBaseExp());
		}
		if (value4 != null) {
			int p_num =151;
			String name = "Mew";
			// Create the object for Mew class and use getters to retrieve the values	
			Mew m=new Mew("Mew",151,"Mew is a psychic-type Mythical pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"pSYCHIC","NONE","64");
			msg = "<center>" + name + "  #" + p_num; 
			request.setAttribute("message4",m.getPokemonNumber());
			request.setAttribute("character4", m.getCharacteristics());
			request.setAttribute("type4",m.getType());
			request.setAttribute("evolution4", m.getEvolution());
			request.setAttribute("baseExp4", m.getBaseExp());
		}

		if (value5 != null) {
			int p_num = 25;
			String name = "Pikachu";
			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			Pikachu pika=new Pikachu("pikachu",25,"pikachu is an Electric-type pokémon, which was introduced in Generation I. Over the years, pikachu has become so popular that it serves as the pokémon franchise mascot.",
					"ELECTRIC","RAICHU","112");
			msg = "<center>" + name + "  #" + p_num; 
			request.setAttribute("message5",pika.getPokemonNumber());
			request.setAttribute("character5", pika.getCharacteristics());
			request.setAttribute("type5",pika.getType());
			request.setAttribute("evolutions5", pika.getEvolution());
			request.setAttribute("baseExp5", pika.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
