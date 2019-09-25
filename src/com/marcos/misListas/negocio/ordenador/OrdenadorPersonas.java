package com.marcos.misListas.negocio.ordenador;

import java.util.Comparator;
import com.marcos.misListas.beans.Persona;



public class OrdenadorPersonas implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		
		return p1.getEdad()-p2.getEdad();
	}

	
	
}
