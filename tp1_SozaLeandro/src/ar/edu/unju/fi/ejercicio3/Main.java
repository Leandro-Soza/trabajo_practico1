package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, aux;
		System.out.println("Ingrese número entero: ");
		numero = sc.nextInt();
		System.out.println("Número ingresado es: "+numero);
		sc.close();
		if(numero % 2 == 0) {
			System.out.println("El número ingresado es PAR");
			aux = numero*numero*numero;
			System.out.println("El triple: "+aux);
		} else {
			if(numero % 2 != 0) {
				System.out.println("El número ingresado es IMPAR");
				aux = numero*numero;
				System.out.println("El doble: "+aux);
			}else {
				System.out.println("Valor ingresado es incorrecto");
			}
		}
	}

}
