package net.itinajero.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.itinajero.app.model.Pelicula;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/detail")
	public String mostrarDetalle(Model modelo) {
		
		String tituloPelicula="Rapidos y furiosos";
		int duracion =136;
		double precioEntrada= 50;
		
		modelo.addAttribute("titulo", tituloPelicula);
		modelo.addAttribute("duracion", duracion);
		modelo.addAttribute("precio", precioEntrada);
		
		return "detalle";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model vista) {
		
		List<String> peliculas = new LinkedList<>();
		
		peliculas.add("Rapidos y Furiosos");
		peliculas.add("Pinocho");
		peliculas.add("El maquinista");
		
		vista.addAttribute("peliculas", peliculas);
		
		return "home";
	}
	
	private List<Pelicula> getLista(){
		
		SimpleDateFormat formatear = new SimpleDateFormat("dd-mm-yyyy");
		List<Pelicula> lista = null;
		
		try {
			lista = new LinkedList<Pelicula>();
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("Power Ranger");
			pelicula1.setClasificacion("B");
			pelicula1.setDuracion(120);
			pelicula1.setGenero("Acci�n");
			pelicula1.setFechaExtreno(formatear.parse("02-03-2001"));
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(2);
			pelicula2.setTitulo("Power Ranger II");
			pelicula2.setClasificacion("B");
			pelicula2.setDuracion(220);
			pelicula2.setGenero("Acci�n");
			pelicula2.setFechaExtreno(formatear.parse("05-04-2011"));
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(3);	
			pelicula3.setTitulo("El Maquinista");
			pelicula3.setClasificacion("C");
			pelicula3.setDuracion(240);
			pelicula3.setGenero("Drama");
			pelicula3.setFechaExtreno(formatear.parse("12-07-2014"));
			
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			
			
			
		}catch(ParseException e){
			System.out.println("Peto: "+e);
		}
		
		return lista;
	}
}
