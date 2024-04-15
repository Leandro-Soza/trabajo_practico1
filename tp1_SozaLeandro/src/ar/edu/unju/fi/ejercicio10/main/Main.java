package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static Pizza picsas() {
		Scanner sc = new Scanner(System.in);
		Pizza picsa = new Pizza();
		boolean aux = true;
		boolean auxp = true;
		while(aux) {
			System.out.println("Seleccione diametro de pizza 20 - 30 - 40");
			System.out.print("Ingrese diametro: ");
			int diametro = sc.nextInt();
			sc.nextLine();
			if(diametro==20 || diametro==30 || diametro==40) {
				picsa.setDiametroPizza(diametro);
				aux=false;
			}else {
				System.out.println("Valor ingresado incorrecto");
			}
		}
		while(auxp) {
			System.out.print("Desea agregar ingredientes especiales? s/n: ");
			char rta = sc.next().charAt(0);
			if(rta=='s' || rta=='S') {
				picsa.setIngredientesPizza(true);
				auxp=false;
			}else if(rta=='n' || rta=='N') {
				picsa.setIngredientesPizza(false);
				auxp=false;
			}else {
				System.out.println("Opción ingresada NO valida");
			}
		}
		float precioFinal = picsa.calcularPrecio();
		picsa.setPrecioPizza(precioFinal);
		return picsa;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de pizzas a calcular: ");
		int cantidad = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=cantidad;i++) {
			System.out.println("***PIZZA "+i+"***");
			Pizza pisas = picsas();
			System.out.println("Diámetro: "+pisas.getDiametroPizza());
			System.out.println("Ingredientes especiales: "+pisas.getIngredientesPizza());
			System.out.println("Precio pizza: "+pisas.getPrecioPizza()+"$");
			System.out.println("Área de la pizza: "+pisas.calcularArea());
		}
		sc.close();
	}

}
