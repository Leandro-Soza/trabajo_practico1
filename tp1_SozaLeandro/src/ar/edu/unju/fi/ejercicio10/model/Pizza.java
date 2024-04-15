package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private Integer diametroPizza;
	private Float precioPizza;
	private Float areaPizza;
	private Boolean ingredientesPizza;
	private final Float ingEsp20 = 500f;
	private final Float ingEsp30 = 750f;
	private final Float ingEsp40 = 1000f;
	
	
	public Pizza() {
	}


	public Integer getDiametroPizza() {
		return diametroPizza;
	}


	public void setDiametroPizza(Integer diametroPizza) {
		this.diametroPizza = diametroPizza;
	}


	public Float getPrecioPizza() {
		return precioPizza;
	}


	public void setPrecioPizza(Float precioPizza) {
		this.precioPizza = precioPizza;
	}


	public Float getAreaPizza() {
		return areaPizza;
	}


	public void setAreaPizza(Float areaPizza) {
		this.areaPizza = areaPizza;
	}


	public Boolean getIngredientesPizza() {
		return ingredientesPizza;
	}


	public void setIngredientesPizza(Boolean ingredientesPizza) {
		this.ingredientesPizza = ingredientesPizza;
	}


	public Float getIngEsp20() {
		return ingEsp20;
	}


	public Float getIngEsp30() {
		return ingEsp30;
	}


	public Float getIngEsp() {
		return ingEsp40;
	}
	
	public Float calcularPrecio() {
		if(diametroPizza==20 && !ingredientesPizza) {
			precioPizza=4500f;
		}
		if(diametroPizza==20 && ingredientesPizza) {
			precioPizza=4500f+ingEsp20;
		}
		if(diametroPizza==30 && !ingredientesPizza) {
			precioPizza=4800f;
		}
		if(diametroPizza==30 && ingredientesPizza) {
			precioPizza=4800f+ingEsp30;
		}
		if(diametroPizza==40 && !ingredientesPizza) {
			precioPizza=5500f;
		}
		if(diametroPizza==40 && ingredientesPizza) {
			precioPizza=5500f+ingEsp40;
		}
		return precioPizza;
	}
	
	public Double calcularArea() {
		double aux = diametroPizza/2;
		return Math.PI*Math.pow(aux, 2);
	}
	
}
