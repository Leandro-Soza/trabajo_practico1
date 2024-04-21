package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	private static Scanner sc;
	private static ArrayList<Jugador> jugadores;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		jugadores = new ArrayList<>();
		byte op = 0;
		
		do {
			
			try {
				System.out.println("***MENU DE OPCIONES***");
				System.out.println("1-Alta de jugador");
				System.out.println("2-Mostrar datos del jugador");
				System.out.println("3-Mostrar todos los jugadores");
				System.out.println("4-Modificar datos de un jugador");
				System.out.println("5-Eliminar un jugador");
				System.out.println("6-Mostrar cantidad total de jugadores");
				System.out.println("7-Mostrar cantidad de jugadores de determinada nacionalidad");
				System.out.println("8-Salir");
				System.out.println("---------------");
				System.out.print("Ingrese su opción: ");
				op = sc.nextByte();
				sc.nextLine();
				switch(op) {
				case 1: System.out.println("Realizar alta");
				cargarJugadores();
				break;
				case 2: System.out.println("Mostrar datos");
				mostrarUnJugador();
				break;
				case 3: System.out.println("Mostrar jugadores");
				mostrarJugadores();
				break;
				case 4: System.out.println("Modificar datos");
				modificarJugador();
				break;
				case 5: System.out.println("Eliminar jugador");
				eliminarJugador();
				break;
				case 6: System.out.println("Cantidad de jugadores");
				System.out.println("Jugadores: "+cantidadJugadores());
				break;
				case 7: System.out.println("Jugadores de determinada nacionalidad");
				System.out.println("Cantidad de jugadores de misma nacionalidad: "+cantidadJugadNacio());
				break;
				case 8: System.out.println("Fin del programa - Salir");
				break;
				default: System.out.println("Opción Incorrecta!");
				}
			}catch(InputMismatchException e) {
				System.out.println("Error en el valor ingresado");
				System.out.println("Debe ingresar valor numerico entero");
				sc.nextLine();
			}
			
		}while(op!=8);
		sc.close();
	}
	/**
	 * Carga de jugadores en el ArrayList jugadores
	 */
	public static void cargarJugadores() {
		try {
			System.out.print("Ingrese nombre jugador: ");
			String name = sc.nextLine();
			System.out.print("Ingrese apellido jugador: ");
			String surName = sc.nextLine();
			System.out.println("Fecha de Nacimiento");
			System.out.print("Dia: ");
			byte day = sc.nextByte();
			System.out.print("Mes: ");
			byte month = sc.nextByte();
			System.out.print("Año: ");
			int year = sc.nextInt();
			sc.nextLine();
			System.out.print("Ingrese Nacionalidad: ");
			String nacioPer = sc.nextLine();
			System.out.print("Ingrese estatura: ");
			Double high = (double) sc.nextFloat();
			sc.nextLine();
			System.out.print("Ingrese peso: ");
			Float weight = (float) sc.nextFloat();
			sc.nextLine();
			System.out.println("Ingrese posicion");
			System.out.println("delanter - medio - defensa - arquero");
			String position = sc.nextLine();
			jugadores.add(new Jugador(name, surName, LocalDate.of(year, month, day), nacioPer, high, weight, position));
		}catch(InputMismatchException e){
			System.out.println("Error en el ingreso de datos");
			System.out.println("Verifica que ingrese lo que se le solicita");
		}
			
	}
	/**
	 * Muestra jugadores guardados, ordenando por apellido
	 */
	public static void mostrarJugadores() {
		System.out.println("Lista de jugadores ordenados por apellido");
		jugadores.sort(Comparator.comparing(Jugador::getApellidoPer));
		jugadores.forEach(j->System.out.println(j));{
			
		}
	}
	/**
	 * Busca si encuentra apellido y nombre ingresado por usuario
	 * y devuelve datos del jugador en caso de encontrarlo
	 * o mensaje que no existe en caso de que no
	 */
	public static void mostrarUnJugador() {
		int cont=0;
		System.out.print("Ingrese nombre del jugador: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese apellido del jugador: ");
		String apellido = sc.nextLine();
		for(Jugador jugador: jugadores) {
			if(jugador.getNombrePer().equals(nombre) && jugador.getApellidoPer().equals(apellido)) {
				System.out.println("Nombre: "+jugador.getNombrePer());
				System.out.println("Apellido: "+jugador.getApellidoPer());
				System.out.println("Fecha Nacimiento: "+jugador.getFechaNacimiento());
				System.out.println("Edad: "+jugador.calcularEdad());
				System.out.println("Nacionalidad: "+jugador.getNacionalidadPer());
				System.out.println("Estatura: "+jugador.getAlturaPer());
				System.out.println("Peso: "+jugador.getPesoPer());
				System.out.println("Posición: "+jugador.getPosicionCancha());
				break;
			}else {
				cont++;
			}
			if(jugadores.size()==cont) {
				System.out.println("No existe el jugador buscado");
			}
		}
	}
	/**
	 * Modifica jugador en caso de encontrar
	 */
	public static void modificarJugador() {
		int cont=0;
		System.out.print("Ingrese nombre jugador: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese apellido jugador: ");
		String apellido = sc.nextLine();
		for(Jugador player: jugadores) {
			if(player.getNombrePer().equals(nombre) && player.getApellidoPer().equals(apellido)) {
				boolean aux = false;
				do {
					System.out.println("Ingrese Fecha Nacimiento dd/mm/yyyy");
					System.out.print("Dia: ");
					byte day = sc.nextByte();
					System.out.print("Mes: ");
					byte month = sc.nextByte();
					System.out.print("Año: ");
					int year = sc.nextInt();
					player.setFechaNacimiento(LocalDate.of(year, month, day));
					sc.nextLine();
					System.out.print("Ingrese nacionalidad: ");
					String nacio = sc.nextLine();
					player.setNacionalidadPer(nacio);
					System.out.print("Ingrese estatura: ");
					Double altura = sc.nextDouble();
					player.setAlturaPer(altura);
					sc.nextLine();
					System.out.print("Ingrese peso: ");
					Float peso = sc.nextFloat();
					player.setPesoPer(peso);
					sc.nextLine();
					System.out.println("Posiciones: delantero - medio - defensa - arquero");
					System.out.print("Ingrese posicion en cancha: ");
					String posic = sc.nextLine();
					player.setPosicionCancha(posic);
					aux=true;
					cont++;
					break;
				}while(aux == false);
			}
		}
		if(cont==1) {
			System.out.println("Se modifico el jugador");
		}else {
			System.out.println("No existe jugador a modificar");
		}
		
	}
	/**
	 * Elimina jugador del arraylist
	 */
	public static void eliminarJugador() {
		System.out.print("Ingrese nombre jugador: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese apellido jugador: ");
		String apellido = sc.nextLine();
		Iterator<Jugador> iterator = jugadores.iterator();
		while(iterator.hasNext()) {
			Jugador player = iterator.next();
			if(player.getNombrePer().equals(nombre) && player.getApellidoPer().equals(apellido)) {
				iterator.remove();
				System.out.println("Se elimino el jugador "+apellido +" " +nombre);
			}
		}
	}
	/**
	 * Muestra cantidad de jugadores en el arraylist
	 * @return cantidad de jugadores
	 */
	public static Integer cantidadJugadores() {
		return jugadores.size();
	}
	/**
	 * Busca x nacionalidad cuantos pertenecen a la misma
	 * @return resultado de cuantos coinciden
	 */
	public static Integer cantidadJugadNacio() {
		int cont=0;
		System.out.print("Ingrese nacionalidad: ");
		String nacio = sc.nextLine();
		for(Jugador player: jugadores) {
			if(player.getNacionalidadPer().equals(nacio)) {
				cont++;
			}
		}
		return cont;
		
	}
}
