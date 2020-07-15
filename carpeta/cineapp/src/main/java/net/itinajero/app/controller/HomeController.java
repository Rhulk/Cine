package net.itinajero.app.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
