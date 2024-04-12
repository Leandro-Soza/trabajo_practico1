package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	private String nombreProv;
	
	
	public Persona() {
	}


	public Persona(String dni, String nombre, LocalDate fechaNac, String nombreProv) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.nombreProv = nombreProv;
	}


	public Persona(String dni, String nombre, LocalDate fechaNac) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.nombreProv = "Jujuy";
	}


	/*public Persona(String nombreProv) {
		this.nombreProv = "Jujuy";
	}*/


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}


	public String getNombreProv() {
		return nombreProv;
	}


	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}
	
	
	public void jovenAdulto(LocalDate fechaNac) {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.getFechaNac(), hoy);
		int edad = periodo.getYears();
		System.out.println("***MUESTRA DE DATOS***");
		System.out.println("----------------");
		System.out.println("Tiene "+edad+" años");
		boolean age;
		age = true;
		if(edad >= 18) {
			System.out.println(age);
			System.out.println("Es mayor de edad");
		}else {
			age = false;
			System.out.println(age);
			System.out.println("Es menor de edad");
		}
	}
	
	public void mostrarDatos() {
		System.out.println("DNI: "+dni);
		System.out.println("Nombre: "+nombre);
		System.out.println("Fecha Nacimiento: "+fechaNac);
		System.out.println("Provincia: "+nombreProv);
	}
	
}
