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
		String charac="";
		String typ="";
		String evol="";
		String base="";
		String bulbasaur="Bulbasaur";
		String charizard="Charizard";
		String dragonite="Dragonite";
		String mew="Mew";
		String pikachu="Pikachu";
		int pokemonNumber;
		String characteristics = null;
		String type = null;
		String evolution = null;
		String baseExp = null;

		if (value1 != null) {
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			pokemonNumber=001;
			Bulbasaur p=new Bulbasaur(bulbasaur,pokemonNumber, characteristics, type, evolution, baseExp);
		 characteristics=p.getCharacteristics();
		  type=p.getType();
		  evolution=p.getEvolution();
		  baseExp=p.getBaseExp();
			msg = "<center>" +bulbasaur+ "  #" + pokemonNumber;
			charac=characteristics;
			typ=type;
			evol=evolution;
			base=baseExp;
			request.setAttribute("message1",msg);
			request.setAttribute("character1", charac);
			request.setAttribute("type1",typ);
			request.setAttribute("evolution1", evol);
			request.setAttribute("baseExp1", base);
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			pokemonNumber=006;
		Charizard c=new Charizard(charizard, pokemonNumber, characteristics, type, evolution, baseExp);
		characteristics=c.getCharacteristics();
		  type=c.getType();
		  evolution=c.getEvolution();
		  baseExp=c.getBaseExp();  
			msg = "<center>" + charizard + "  #" + pokemonNumber;
			charac=characteristics;
			typ=type;
			evol=evolution;
			base=baseExp;
			request.setAttribute("message2",msg);
			request.setAttribute("character2", charac);
			request.setAttribute("type2",typ);
			request.setAttribute("evolution2", evol);
			request.setAttribute("baseExp2", base);
		}

		if (value3 != null) {
pokemonNumber=149;
			// Create the object for Dragonite class and use getters to retrieve the values	
Dragonite d=new Dragonite(dragonite, pokemonNumber, characteristics, type, evolution, baseExp);
characteristics=d.getCharacteristics();
type=d.getType();
evolution=d.getEvolution();
baseExp=d.getBaseExp();   
			msg = "<center>" + dragonite + "  #" + pokemonNumber;
					charac=characteristics;
			typ=type;
			evol=evolution;
			base=baseExp;
			request.setAttribute("message3",msg);
			request.setAttribute("character3", charac);
			request.setAttribute("type3",typ);
			request.setAttribute("evolution3", evol);
			request.setAttribute("baseExp3", base);
		}
		if (value4 != null) {
pokemonNumber=151;
			// Create the object for Mew class and use getters to retrieve the values	
			  Mew m=new Mew(mew, pokemonNumber, characteristics, type, evolution, baseExp);
			  characteristics=m.getCharacteristics();
			  type=m.getType();
			  evolution=m.getEvolution();
			  baseExp=m.getBaseExp() ;
			msg = "<center>" + mew+ "  #" + pokemonNumber;
			charac=characteristics;
			typ=type;
			evol=evolution;
			base=baseExp;
			request.setAttribute("message4",msg);
			request.setAttribute("character4", charac);
			request.setAttribute("type4",typ);
			request.setAttribute("evolution4", evol);
			request.setAttribute("baseExp4", base);
		}

		if (value5 != null) {
pokemonNumber=25;
			// Create the object for Pikachu class and use getters to retrieve the values	
Pikachu pi=new Pikachu(pikachu, pokemonNumber, characteristics, type, evolution, baseExp);
characteristics=pi.getCharacteristics();
type=pi.getType();
evolution=pi.getEvolution();
baseExp=pi.getBaseExp() ;	  
			msg = "<center>" + pikachu + "  #" + pokemonNumber;
					charac=characteristics;
			typ=type;
			evol=evolution;
			base=baseExp;
			request.setAttribute("message5",msg);
			request.setAttribute("character5", charac);
			request.setAttribute("type5",typ);
			request.setAttribute("evolution5", evol);
			request.setAttribute("baseExp5", base);

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
