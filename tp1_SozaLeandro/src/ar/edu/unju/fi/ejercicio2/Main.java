package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		String nombrePais;
		int edadPersona;
		float alturaEdif;
		float precioProducto;
		int numeroTelef;
		double calculoCoseno;
		
		nombrePais = "Argentina";
		edadPersona = 25;
		alturaEdif = 550.25f;
		precioProducto = 2520.59f;
		numeroTelef = 1549874561;
		calculoCoseno = Math.cos(Math.toRadians(0.5));
		
		System.out.println("Nombre del Pais: "+nombrePais);
		System.out.println("Edad de la persona: "+edadPersona +" años");
		System.out.println("Altura del edificio: "+alturaEdif +" metros");
		System.out.println("Precio del producto: $"+precioProducto);
		System.out.println("Número de teléfono: "+numeroTelef);
		System.out.println("Coseno de 0,5 es: "+calculoCoseno);
		
	}

}
