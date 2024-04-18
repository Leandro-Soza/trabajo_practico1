package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean auxi = false;
		int numero;
		do {
			System.out.print("Ingrese número entre 5 y 10: ");
			numero = sc.nextInt();
			if(numero>=5 && numero<=10) {
				auxi=true;
			}
		}while(auxi==false);
		sc.nextLine();
		/**
		 * Ingreso de nombres al arreglo
		 */
		String[] nombre = new String[numero];
		int aux=0;
		while(aux<nombre.length) {
			System.out.println("Ingrese un nombre: ");
			nombre[aux] = sc.nextLine();
			aux++;
		}
		
		/**
		 * Muestra de datos
		 */
		
		for(int i=0;i<nombre.length;i++) {
			System.out.println("Posición ["+i+"]: "+nombre[i]);
		}
		System.out.println("*****ORDEN INVERTIDO*****");
		for(int j=nombre.length-1 ; j>=0 ; j-- ) {
			System.out.println("Posición ["+j+"]: "+nombre[j]);
		}
		
		sc.close();
	}

}
