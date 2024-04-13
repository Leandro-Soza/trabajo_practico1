package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***INGRESO DE DATOS***");
		System.out.print("Ingrese Nombre y Apellido de Empleado: ");
		String name = sc.nextLine();
		System.out.print("Ingrese Número de Legajo: ");
		int num = sc.nextInt();
		System.out.print("Ingrese Salario: $");
		Float salario = sc.nextFloat();
		Empleado persona = new Empleado(name, num, salario);
		persona.mostrarDatos();
		persona.aumentoSalario();
		System.out.println("Datos con el aumento de salario");
		persona.mostrarDatos();
	}

}
