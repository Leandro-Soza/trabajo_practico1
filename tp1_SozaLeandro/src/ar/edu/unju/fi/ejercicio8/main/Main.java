package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculadoraEspecial num = new CalculadoraEspecial();
		System.out.print("Ingrese número entero: ");
		num.setN(sc.nextInt());
		System.out.println("Sumatoria: "+num.calcularSumatoria());
		System.out.println("Productoria: "+num.calcularProductorioa());
	}

}
