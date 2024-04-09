package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor, factorial, dato;
		System.out.println("Ingrese número: ");
		valor = sc.nextInt();
		sc.close();
		System.out.println("Número ingresado: "+valor);
		if(valor >= 0 && valor <=10) {
			factorial = 1;
			dato = valor;
			while(dato > 0) {
				factorial = factorial * dato;
				dato--;
			}
			System.out.println("El factorial es: "+factorial);
		} else {
			System.out.println("Error en el valor ingresado");
		}
	}

}
