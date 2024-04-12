package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	
	public static Persona persona1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**DATOS PRIMERA PERSONA**");
		Persona per1 = new Persona();
		System.out.println("Ingrese DNI: ");
		per1.setDni(sc.nextLine());
		System.out.println("Ingrese Nombre: ");
		per1.setNombre(sc.nextLine());
		System.out.println("Fecha de Nacimiento: dd/mm/yyyy");
		System.out.print("Ingrese Dia: ");
		byte dia = sc.nextByte();
		System.out.print("Ingrese Mes: ");
		byte mes = sc.nextByte();
		System.out.print("Ingrese Año: ");
		short anio = sc.nextShort();
		per1.setFechaNac(LocalDate.of(anio, mes, dia));
		sc.nextLine();
		System.out.print("Ingrese Provincia: ");
		per1.setNombreProv(sc.nextLine());
		per1.jovenAdulto(LocalDate.of(anio, mes, dia));
		return per1;
	}
	
	public static Persona persona2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**DATOS SEGUNDA PERSONA**");
		System.out.print("Ingrese DNI: ");
		String dni = sc.nextLine();
		System.out.print("Ingrese Nombre: ");
		String name = sc.nextLine();
		System.out.println("Fecha de Nacimiento: dd/mm/yyyy");
		System.out.print("Ingrese Dia: ");
		byte day = sc.nextByte();
		System.out.print("Ingrese Mes: ");
		byte month = sc.nextByte();
		System.out.print("Ingrese Año: ");
		short year = sc.nextShort();
		sc.nextLine();
		System.out.print("Ingrese Provincia: ");
		String provi = sc.nextLine();
		Persona per2 = new Persona(dni, name, LocalDate.of(year, month, day), provi);
		per2.jovenAdulto(LocalDate.of(year, month, day));
		return per2;
	}
	
	public static Persona persona3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**DATOS TERCERA PERSONA**");
		System.out.print("Ingrese DNI: ");
		String DNI = sc.nextLine();
		System.out.print("Ingrese Nombre: ");
		String NAME = sc.nextLine();
		System.out.println("Fecha de Nacimiento: dd/mm/yyyy");
		System.out.print("Ingrese Dia: ");
		byte DAY = sc.nextByte();
		System.out.print("Ingrese Mes: ");
		byte MONTH = sc.nextByte();
		System.out.print("Ingrese Año: ");
		short YEAR = sc.nextShort();
		sc.nextLine();
		Persona per3 = new Persona(DNI, NAME, LocalDate.of(YEAR, MONTH, DAY));
		System.out.println(per3.getNombreProv());
		per3.jovenAdulto(LocalDate.of(YEAR, MONTH, DAY));
		sc.close();
		return per3;
	}
	
	
	public static void main(String[] args) {
		
		Persona perso1 = persona1();
		perso1.mostrarDatos();
		Persona perso2 = persona2();
		perso2.mostrarDatos();
		Persona perso3 = persona3();
		perso3.mostrarDatos();
		
	}

}
