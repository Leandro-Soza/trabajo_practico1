package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, valor;
		System.out.println("Ingrese número entre 1 y 9: ");
		numero = sc.nextInt();
		sc.close();
		System.out.println("Número ingresado: "+numero);
		if(numero >= 1 && numero <= 9) {
			for(int i=0;i<=10;i++) {
				valor = numero*i;
				System.out.println(numero +" x "+i +" = "+valor);
			}
			System.out.println("Fin de cálculo");
		}else {
			System.out.println("Número ingresado no valido");
		}
	}

}
