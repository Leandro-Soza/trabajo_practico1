package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] elementos = new String[5];
		/**
		 * Carga de nombres
		 */
		for(int i=0;i<elementos.length;i++) {
			System.out.print("Ingrese nombre para pos. ["+i+"]: ");
			elementos[i] = sc.nextLine();
		}
		/**
		 * Muestra de valores y tamaño del arreglo
		 */
		int j=0;
		while(j<elementos.length) {
			System.out.println("Valor en ["+j+"]: "+elementos[j]);
			j++;
		}
		System.out.println("Tamaño del arreglo: "+elementos.length);
		/**
		 * Ingreso de posición y eliminación de dato
		 */
		byte dato;
		boolean ayuda=false;
		do {
			System.out.print("Ingrese posición a elimiar dato: ");
			dato = sc.nextByte();
			if(dato>=0 && dato<5) {
				ayuda=true;
			} else {
				System.out.println("No existe posición en el arreglo");
				sc.nextLine();
			}
		}while(ayuda==false);
		System.out.println("Dato en posición a eliminar: "+dato);
		sc.nextLine();
		for(int k=dato;k<elementos.length-1;k++) {
			elementos[k] = elementos[k+1];
		}
		/**
		 * Muestra de datos modificados
		 */
		System.out.println("Mostrar arreglo con elemento borrado");
		for(int l=0;l<elementos.length-1;l++) {
			System.out.println("Pos. ["+l+"]: "+elementos[l]);
		}
		sc.close();
	}

}
