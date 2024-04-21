package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	
	private String nombrePer;
	private String apellidoPer;
	private LocalDate fechaNacimiento;
	private String nacionalidadPer;
	private Double alturaPer;
	private Float pesoPer;
	private String posicionCancha;
	
	
	public Jugador() {
	}


	public Jugador(String nombrePer, String apellidoPer, LocalDate fechaNacimiento, String nacionalidadPer,
			Double alturaPer, Float pesoPer, String posicionCancha) {
		this.nombrePer = nombrePer;
		this.apellidoPer = apellidoPer;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidadPer = nacionalidadPer;
		this.alturaPer = alturaPer;
		this.pesoPer = pesoPer;
		this.posicionCancha = posicionCancha;
	}


	@Override
	public String toString() {
		return "Nombre: " + nombrePer + 
				"\nApellido: " + apellidoPer + 
				"\nFecha de Nacimiento: "+ fechaNacimiento +
				"\nEdad: "+calcularEdad() +
				"\nNacionalidad: " + nacionalidadPer +
				"\nAltura: " + alturaPer +
				"\nPeso: "+ pesoPer +
				"\nPosición: " + posicionCancha;
	}


	public String getNombrePer() {
		return nombrePer;
	}


	public void setNombrePer(String nombrePer) {
		this.nombrePer = nombrePer;
	}


	public String getApellidoPer() {
		return apellidoPer;
	}


	public void setApellidoPer(String apellidoPer) {
		this.apellidoPer = apellidoPer;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNacionalidadPer() {
		return nacionalidadPer;
	}


	public void setNacionalidadPer(String nacionalidadPer) {
		this.nacionalidadPer = nacionalidadPer;
	}


	public Double getAlturaPer() {
		return alturaPer;
	}


	public void setAlturaPer(Double alturaPer) {
		this.alturaPer = alturaPer;
	}


	public Float getPesoPer() {
		return pesoPer;
	}


	public void setPesoPer(Float pesoPer) {
		this.pesoPer = pesoPer;
	}


	public String getPosicionCancha() {
		return posicionCancha;
	}


	public void setPosicionCancha(String posicionCancha) {
		this.posicionCancha = posicionCancha;
	}
	
	public Integer calcularEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento, hoy);
		return periodo.getYears();
	}
	
}
