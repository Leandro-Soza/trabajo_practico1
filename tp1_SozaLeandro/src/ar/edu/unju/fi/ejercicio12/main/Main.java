package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona persona = new Persona();
		Calendar fechaNacim = Calendar.getInstance();
		System.out.print("Ingrese nombre: ");
		String name = sc.nextLine();
		System.out.println("Ingrese Fecha de Nacimiento");
		System.out.println("dd-mm-yyyy");
		System.out.print("Dia: ");
		byte day = sc.nextByte();
		System.out.print("Mes: ");
		byte month = sc.nextByte();
		System.out.print("Año: ");
		short year = sc.nextShort();
		sc.nextLine();
		persona.setNombrePersona(name);
		fechaNacim.set(year, month-1, day);
		persona.setFechaNacim(fechaNacim);
		
		int age = persona.edadPersona(fechaNacim);
		System.out.println("Nombre: "+persona.getNombrePersona());
		System.out.println("Fecha Nacimiento: "+day+"/"+month+"/"+year);
		System.out.println("Edad: "+age);
		System.out.println("Singo del Zodiaco: "+persona.signoZodiaco());
		System.out.println("Estación: "+persona.estaciones());
		sc.close();
	}

}
