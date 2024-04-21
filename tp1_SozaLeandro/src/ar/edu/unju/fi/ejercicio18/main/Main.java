package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	private static Scanner sc;
	private static ArrayList<Pais> paises;
	private static ArrayList<DestinoTuristico> destinos;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		generarDestinos();
		destinos = new ArrayList<>();
		
		byte op=0;
		do {
			try {
				op=menu();
				switch(op) {
				case 1: System.out.println("Alta de destino");
				altaDestino();
				System.out.println("---------------");
					break;
				case 2: System.out.println("Destinos Turisticos");
				mostrarDestinos();
				System.out.println("---------------");
					break;
				case 3: System.out.println("Modificación pais de destino");
				modificarPaisDestino();
				System.out.println("---------------");
					break;
				case 4: System.out.println("Limpiar Destinos Turisticos");
				limpiarDestino();
				System.out.println("---------------");
					break;
				case 5: System.out.println("Eliminacion de destino");
				eliminarDestino();
				System.out.println("---------------");
					break;
				case 6: System.out.println("Destinos ordenados por nombre");
				ordenarDestinos();
				System.out.println("---------------");
					break;
				case 7: System.out.println("***Paises***");
				mostrarPaises();
				System.out.println("---------------");
					break;
				case 8: System.out.println("Destinos de un mismo pais");
				destinosMismoPais();
				System.out.println("---------------");
					break;
				case 9: System.out.println("Fin del programa");
				System.out.println("---------------");
					break;
					default: System.out.println("Opción Incorrecta!");
				}
			}catch(InputMismatchException e) {
				System.out.println("Ingreso de datos ERRONEO");
				System.out.println("Debe ingresar valor entero (byte)");
				sc.nextLine();
			}
		}while(op!=9);
	}
	
	public static void generarDestinos() {
		paises = new ArrayList<>();
		paises.add(new Pais(11111, "Argentina"));
		paises.add(new Pais(22222, "Brasil"));
		paises.add(new Pais(11111, "Argentina"));
		paises.add(new Pais(33333, "Italia"));
		paises.add(new Pais(44444, "España"));
		paises.add(new Pais(55555, "Francia"));
		paises.add(new Pais(11111, "Argentina"));
		paises.add(new Pais(22222, "Brasil"));
		paises.add(new Pais(88888, "Alemania"));
		paises.add(new Pais(77777, "Islandia"));
	}
	
	public static byte menu() {
		byte op=0;
		System.out.println("***MENU DE OPCIONES***");
		System.out.println("1-Alta destino turistico");
		System.out.println("2-Mostrar destinos turisticos");
		System.out.println("3-Modificar pais de destino");
		System.out.println("4-Limpiar ArrayList de destino turistico");
		System.out.println("5-Eliminar un destino turistico");
		System.out.println("6-Mostrar destinos turisticos ordenados por nombre");
		System.out.println("7-Mostrar todos los paises");
		System.out.println("8-Mostrar destinos turisticos que pertenecen a un pais");
		System.out.println("9-Salir");
		System.out.println("---------------");
		System.out.print("Ingrese su opción: ");
		op = sc.nextByte();
		return op;
	}
	
	public static void altaDestino() {
		DestinoTuristico desTur = new DestinoTuristico();
		System.out.print("Ingrese código de destino turistico: ");
		Integer codigo = sc.nextInt();
		desTur.setCodigo(codigo);
		sc.nextLine();
		System.out.print("Ingrese nombre de destino turistico: ");
		String name = sc.nextLine();
		desTur.setNombre(name);
		System.out.print("Ingrese precio de destino turistico: ");
		Double precio = sc.nextDouble();
		desTur.setPrecio(precio);
		sc.nextLine();
		System.out.print("Ingrese código de pais: ");
		int codigoPais = sc.nextInt();
		System.out.print("Ingrese cantidad de dias: ");
		Integer dias = sc.nextInt();
		desTur.setCantidadDias(dias);
		sc.nextLine();
		Pais pais = buscarPais(codigoPais);
		if(pais == null) {
			System.out.println("No existe el pais buscado");
		}else {
			desTur.setPais(pais);
			destinos.add(desTur);
			System.out.println("Se agregó el objeto destino");
		}
	}
	
	public static void mostrarDestinos() {
		if(destinos.isEmpty()) {
			System.out.println("NO HAY VALORES CARGADOS");
		}else {
			destinos.forEach(d->System.out.println(d));{
				
			}
		}
	}
	
	public static void modificarPaisDestino() {
		if(destinos.isEmpty()) {
			System.out.println("No hay valores cargados para modificar");
		}else {
			System.out.print("Ingrese nombre destino: ");
			String nombre = sc.next();
			for(DestinoTuristico desti: destinos) {
				if(desti.getNombre().equals(nombre)) {
					System.out.print("Ingrese nuevo codigo de pais: ");
					int codigoPais = sc.nextInt();
					sc.nextLine();
					Pais pais = buscarPais(codigoPais);
					if(pais == null) {
						System.out.println("No existe el pais buscado");
					}else {
						desti.setPais(pais);
						System.out.println("Se modificó el pais");
					}
				}
			}
		}
		
	}
	
	public static void limpiarDestino() {
		destinos.clear();
	}
	
	/**
	 * Busca objeto pais dentro del ArrayList de paises
	 * @param codigo
	 * @return objeto paisEncontrado
	 */
	public static Pais buscarPais(int codigo) {
		Pais paisEncontrado = null;
		for(Pais pais: paises) {
			if(pais.getCodigo()==codigo) {
				paisEncontrado = pais;
				break;
			}
		}
		return paisEncontrado;
	}
	
	/**
	 * Usando iterador se busca eliminar destino si existe
	 */
	public static void eliminarDestino() {
		if(destinos.isEmpty()) {
			System.out.println("No hay destino para eliminar");
		}else {
			System.out.print("Ingrese código de destino turistico: ");
			Integer codigo = sc.nextInt();
			sc.nextLine();
			Iterator<DestinoTuristico> iterator = destinos.iterator();
			while(iterator.hasNext()) {
				DestinoTuristico desti = iterator.next();
				if(desti.getCodigo().equals(codigo)) {
					iterator.remove();
					System.out.println("Se elimina al destino "+codigo);
				}
			}
		}

	}
	
	public static void ordenarDestinos() {
		System.out.println("Ordenarlos por nombre");
		destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
		destinos.forEach(d->System.out.println(d));
	}
	
	public static void mostrarPaises() {
		paises.forEach(p->System.out.println(p));{
			
		}
	}
	
	public static void destinosMismoPais() {
		if(destinos.isEmpty()) {
			System.out.println("No hay valores cargados");
		}else {
			System.out.print("Ingrese codigo de pais: ");
			Integer codigo = sc.nextInt();
			for(DestinoTuristico desti: destinos) {
				if(desti.getPais().getCodigo().equals(codigo)) {
					System.out.println(desti);
				}
			}
		}
		
	}
	
}
