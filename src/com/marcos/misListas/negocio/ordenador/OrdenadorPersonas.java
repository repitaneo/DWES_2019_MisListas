package com.marcos.misListas.negocio.ordenador;

import java.util.Comparator;
import com.marcos.misListas.beans.Persona;



public class OrdenadorPersonas implements Comparator<Persona> {

	/*
	 * CRITERIO DE ORDENACION
	 * 
	 * 1000: EDAD
	 * 2000: PESO
	 * POR DEFECTO: POR PESO
	 * 
	 */
	private int criterio = 2000;
	
	
	
	
	
	@Override
	public int compare(Persona p1, Persona p2) {
		
		switch(criterio) {
			case 1000: return p1.getEdad()-p2.getEdad();
			case 2000: return p1.getPeso()-p2.getPeso();
			default: return p1.getPeso()-p2.getPeso();
		}
	}

	
	
	public void ordenatePeso() {
		
		criterio = 2000;
	}

	public void ordenateEdad() {
		
		criterio = 1000;
	}

	
	
}
