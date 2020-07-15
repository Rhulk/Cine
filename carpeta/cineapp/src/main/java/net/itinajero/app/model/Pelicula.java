package net.itinajero.app.model;

import java.util.Date;

public class Pelicula {
	
	private int id;
	private String titulo;
	private int duracion;
	private String clasificacion;
	private String genero;
	private String imagen ="cineme.jpg";
	private Date fechaExtreno;
	private String estatus="Activa";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Date getFechaExtreno() {
		return fechaExtreno;
	}
	public void setFechaExtreno(Date fechaExtreno) {
		this.fechaExtreno = fechaExtreno;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", duracion=" + duracion + ", clasificacion="
				+ clasificacion + ", genero=" + genero + ", imagen=" + imagen + ", fechaExtreno=" + fechaExtreno
				+ ", estatus=" + estatus + "]";
	}
	
}
