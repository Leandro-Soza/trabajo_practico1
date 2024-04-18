package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] entero = new int[8];
		int i=0;
		/**
		 * Carga de valores
		 */
		while(i < entero.length) {
			System.out.print("Ingrese valor para la posicion ["+i+"]: ");
			entero[i] = sc.nextInt();
			sc.nextLine();
			i++;
		}
		
		/**
		 * Muestra de valores cargados
		 */
		for(int j=0;j<entero.length;j++) {
			System.out.println("Valor en posición ["+j+"]: "+entero[j]);
		}
		
		sc.close();
	}

}
