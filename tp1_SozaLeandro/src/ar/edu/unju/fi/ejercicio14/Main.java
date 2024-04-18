package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.print("Ingrese numero entre 3 y 10: ");
		int aux = scaner.nextInt();
		scaner.nextLine();
		/**
		 * Asignacioón de tamaño del arreglo e Ingreso de valores
		 */
		int[] enteros = new int[aux];
		int j=0;
		while(j<enteros.length) {
			System.out.print("Ingrese valor para posición ["+j+"]: ");
			enteros[j]=scaner.nextInt();
			scaner.nextLine();
			j++;
		}
		/**
		 * Suma de valores y muestra de valores por cada posición
		 */
		int suma=0;
		for(int i=0;i<enteros.length;i++) {
			suma=suma+enteros[i];
			System.out.println("Valor en posición ["+i+"]: "+enteros[i]);
		}
		System.out.println("Suma de valores: "+suma);
	}

}
