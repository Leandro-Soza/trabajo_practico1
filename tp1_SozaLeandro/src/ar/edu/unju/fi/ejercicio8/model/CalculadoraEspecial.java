package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	private int n;

	public CalculadoraEspecial() {
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria() {
		double rdoSumat = 0;
		double rdo = 0;
		for(int i=1;i<=n;i++) {
			rdo = rdo + Math.pow((i*(i+1))/2, 2);
			rdoSumat = rdo;
		}
		return rdoSumat;
	}
	
	public double calcularProductorioa() {
		double rdoProd = 0;
		double rdo = 1;
		for(int i=1;i<=n;i++) {
			rdo = rdo * (i*(i+4));
			rdoProd = rdo;
		}
		return rdoProd;
	}
	
}
