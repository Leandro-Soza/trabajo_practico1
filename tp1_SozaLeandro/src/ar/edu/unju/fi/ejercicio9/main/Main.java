package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidadProd;
		System.out.println("Ingrese cantidad de productos a ingresar: ");
		cantidadProd = sc.nextInt();
		sc.nextLine();
		if(cantidadProd != 0) {
			while(cantidadProd>0) {
				Producto product = new Producto();
				System.out.print("Ingrese Nombre Producto: ");
				product.setNombreProd(sc.nextLine());
				System.out.print("Ingrese Código Producto: ");
				product.setCodigoProd(sc.nextLine());
				System.out.print("Ingrese Precio Producto: $");
				product.setPrecioProd(sc.nextDouble());
				sc.nextLine();
				System.out.print("Ingrese Descuento Producto: $");
				product.setDescuentoProd(sc.nextInt());
				double precioDescuento;
				product.calcularDescuento();
				if(product.calcularDescuento() != 0) {
					System.out.println("Nombre Producto: "+product.getNombreProd());
					System.out.println("Código Producto: "+product.getCodigoProd());
					System.out.println("Precio Producto: $"+product.getPrecioProd());
					System.out.println("Descuento Producto: $"+product.getDescuentoProd());
					precioDescuento = product.getPrecioProd() - product.calcularDescuento();
					System.out.println("Precio con Descuento: $"+precioDescuento);
					sc.nextLine();
				}else {
					System.out.println("Nombre Producto: "+product.getNombreProd());
					System.out.println("Código Producto: "+product.getCodigoProd());
					System.out.println("Precio Producto: $"+product.getPrecioProd());
					System.out.println("Descuento DEBE SER Nº entero entre 0 y 50");
					sc.nextLine();
				}
				cantidadProd--;
			}
		}else {
			System.out.println("NO INGRESARA NINGUN PRODUCTO");
		}
	sc.close();	
	}

}
