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
		
		List<Pelicula> peliculas = getLista();
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
			pelicula1.setGenero("Acción");
			pelicula1.setFechaEstreno(formatear.parse("02-03-2001"));
			pelicula1.setImagen("power_ranger.jpg");
			pelicula1.setEstatus("activo");
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(2);
			pelicula2.setTitulo("Power Ranger II");
			pelicula2.setClasificacion("B");
			pelicula2.setDuracion(220);
			pelicula2.setGenero("Acción");
			pelicula2.setFechaEstreno(formatear.parse("05-04-2011"));
			pelicula2.setImagen("power_ranger2.jpg");
			pelicula2.setEstatus("Actuva");
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(3);	
			pelicula3.setTitulo("El Maquinista");
			pelicula3.setClasificacion("C");
			pelicula3.setDuracion(240);
			pelicula3.setGenero("Drama");
			pelicula3.setFechaEstreno(formatear.parse("12-07-2014"));
			pelicula3.setImagen("elMaquinista.jpg");
			pelicula3.setEstatus("No activa");

			Pelicula pelicula4 = new Pelicula();
			pelicula4.setId(4);	
			pelicula4.setTitulo("RocknRolla");
			pelicula4.setClasificacion("Z");
			pelicula4.setDuracion(240);
			pelicula4.setGenero("Acción");
			pelicula4.setFechaEstreno(formatear.parse("12-07-1985"));
			pelicula4.setImagen("rocknrolla.jpg");
			pelicula4.setEstatus("Activa");
			
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			lista.add(pelicula4);
			
			return lista;
			
		}catch(ParseException e){
			System.out.println("Peto: "+e);
			return null;
		}
		
		
	}
}
