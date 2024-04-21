package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	private Integer codigo;
	private String pais;
	
	public Pais() {
	}

	public Pais(Integer codigo, String pais) {
		this.codigo = codigo;
		this.pais = pais;
	}
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", pais=" + pais + "]";
	}
	
	
	
}
