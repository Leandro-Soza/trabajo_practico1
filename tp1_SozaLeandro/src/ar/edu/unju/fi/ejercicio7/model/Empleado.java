package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombreEmp;
	private int legajoEmp;
	private Float salarioEmp;
	
	final float salarioMinimo = 210000.00F;
	final float aumentoMerito = 20000.00F;
	
	
	public Empleado(String nombreEmp, int legajoEmp, Float salarioEmp) {
		this.nombreEmp = nombreEmp;
		this.legajoEmp = legajoEmp;
		this.salarioEmp = salarioEmp;
		
		if(this.salarioEmp >= salarioMinimo) {
			this.salarioEmp = salarioEmp;
		}else {
			this.salarioEmp = salarioMinimo;
		}
		
	}
	
	
	
	public String getNombreEmp() {
		return nombreEmp;
	}



	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}



	public int getLegajoEmp() {
		return legajoEmp;
	}



	public void setLegajoEmp(int legajoEmp) {
		this.legajoEmp = legajoEmp;
	}



	public Float getSalarioEmp() {
		return salarioEmp;
	}



	public void setSalarioEmp(Float salarioEmp) {
		this.salarioEmp = salarioEmp;
	}



	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+nombreEmp);
		System.out.println("Legajo: "+legajoEmp);
		System.out.println("Salario $: "+salarioEmp);
	}
	
	public double aumentoSalario() {
		salarioEmp = salarioEmp + aumentoMerito;
		return salarioEmp;
	}
	
}
