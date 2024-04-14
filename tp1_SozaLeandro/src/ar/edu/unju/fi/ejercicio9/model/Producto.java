package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombreProd;
	private String codigoProd;
	private Double precioProd;
	private Integer descuentoProd;
	
	
	public Producto() {
	}


	public String getNombreProd() {
		return nombreProd;
	}


	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}


	public String getCodigoProd() {
		return codigoProd;
	}


	public void setCodigoProd(String codigoProd) {
		this.codigoProd = codigoProd;
	}


	public Double getPrecioProd() {
		return precioProd;
	}


	public void setPrecioProd(Double precioProd) {
		this.precioProd = precioProd;
	}


	public Integer getDescuentoProd() {
		return descuentoProd;
	}


	public void setDescuentoProd(Integer descuentoProd) {
		this.descuentoProd = descuentoProd;
	}
	
	
	public double calcularDescuento() {
		if(this.descuentoProd>=0 && this.descuentoProd<=50) {
			return precioProd * descuentoProd / 100;
		} else {
			return 0;
		}
	}
	
}
