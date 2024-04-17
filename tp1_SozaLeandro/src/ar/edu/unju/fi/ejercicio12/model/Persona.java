package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	private String nombrePersona;
	private Calendar fechaNacim;
	
	
	public Persona() {
	}

	
	public Persona(String nombrePersona, Calendar fechaNacim) {
		this.nombrePersona = nombrePersona;
		this.fechaNacim = fechaNacim;
	}


	public String getNombrePersona() {
		return nombrePersona;
	}


	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}


	public Calendar getFechaNacim() {
		return fechaNacim;
	}


	public void setFechaNacim(Calendar fechaNacim) {
		this.fechaNacim = fechaNacim;
	}
	
	public Integer edadPersona(Calendar fechaNacim) {
		Calendar hoy = Calendar.getInstance();
		int edad;
		if(hoy.get(Calendar.MONTH) >= fechaNacim.get(Calendar.MONTH)) {
			if(hoy.get(Calendar.DATE) >= fechaNacim.get(Calendar.DAY_OF_MONTH)) {
				edad = hoy.get(Calendar.YEAR) - fechaNacim.get(Calendar.YEAR);
			}else {
				edad = hoy.get(Calendar.YEAR) - fechaNacim.get(Calendar.YEAR) - 1;
			}
		}else{
			edad = hoy.get(Calendar.YEAR) - fechaNacim.get(Calendar.YEAR) - 1;
		}
		return edad;
	}
	
	public String signoZodiaco() {
		String signoZod;
		int day = fechaNacim.get(Calendar.DATE);
		int month = fechaNacim.get(Calendar.MONTH);
		switch(month){
		case Calendar.JANUARY:
			if(day<21) {
				signoZod="Capricornio";
			} else {
				signoZod="Acuario";
			} break;
		case Calendar.FEBRUARY:
			if(day<20) {
				signoZod="Acuario";
			}else {
				signoZod="Piscis";
			} break;
		case Calendar.MARCH:
			if(day<21) {
				signoZod="Piscis";
			}else {
				signoZod="Aries";
			} break;
		case Calendar.APRIL:
			if(day<21) {
				signoZod="Aries";
			}else {
				signoZod="Tauro";
			} break;
		case Calendar.MAY:
			if(day<21) {
				signoZod="Tauro";
			}else {
				signoZod="Géminis";
			} break;
		case Calendar.JUNE:
			if(day<21) {
				signoZod="Géminis";
			}else {
				signoZod="Cáncer";
			} break;
		case Calendar.JULY:
			if(day<23) {
				signoZod="Cáncer";
			}else {
				signoZod="Leo";
			} break;
		case Calendar.AUGUST:
			if(day<24) {
				signoZod="Leo";
			}else {
				signoZod="Virgo";
			} break;
		case Calendar.SEPTEMBER:
			if(day<23) {
				signoZod="Virgo";
			}else {
				signoZod="Libra";
			} break;
		case Calendar.OCTOBER:
			if(day<24) {
				signoZod="Libra";
			}else {
				signoZod="Escorpio";
			} break;
		case Calendar.NOVEMBER:
			if(day<23) {
				signoZod="Escorpio";
			}else {
				signoZod="Sagitario";
			} break;
		case Calendar.DECEMBER:
			if(day<22) {
				signoZod="Sagitario";
			}else {
				signoZod="Capricornio";
			} break;
		default:
				signoZod="No pertenece";	
			}
		return signoZod;
	}
	
	public String estaciones() {
		String estation;
		int dia = fechaNacim.get(Calendar.DATE);
		int mes = fechaNacim.get(Calendar.MONTH);
		switch(mes) {
		case Calendar.JANUARY:
		case Calendar.FEBRUARY:
			estation="Verano";
			break;
		case Calendar.MARCH:
			if(dia<21) {
				estation="Verano";
			}else {
				estation="Otoño";
			} break;
		case Calendar.APRIL:
		case Calendar.MAY:
			estation="Otoño";
			break;
		case Calendar.JUNE:
			if(dia<21) {
				estation="Otoño";
			}else {
				estation="Invierno";
			} break;
		case Calendar.JULY:
		case Calendar.AUGUST:
			estation="Invierno";
			break;
		case Calendar.SEPTEMBER:
			if(dia<21) {
				estation="Invierno";
			}else {
				estation="Primavera";
			} break;
		case Calendar.OCTOBER:
		case Calendar.NOVEMBER:
			estation="Primavera";
			break;
		case Calendar.DECEMBER:
			if(dia<21) {
				estation="Primavera";
			}else {
				estation="Verano";
			} break;
		default:
			estation="No existe fecha";
			break;
		}
		return estation;
	}
}
