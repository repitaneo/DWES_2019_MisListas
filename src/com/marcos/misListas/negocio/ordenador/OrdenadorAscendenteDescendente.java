package com.marcos.misListas.negocio.ordenador;

import java.util.Comparator;
import com.marcos.misListas.beans.Persona;



public class OrdenadorAscendenteDescendente implements Comparator<Persona> {

	
	public static final int ORDENACION_ASCENDENTE = 1000;
	public static final int ORDENACION_DESCENDENTE = 2000;
	
	/*
	 * CRITERIO DE ORDENACION
	 * 
	 * 1000: ascendente
	 * 2000: descendente
	 * POR DEFECTO: ascendente
	 * 
	 */
	private int criterioPeso;
	private int criterioEdad;
	
	
	
	
	public OrdenadorAscendenteDescendente() {
		
		criterioPeso = ORDENACION_ASCENDENTE;
		criterioEdad = ORDENACION_ASCENDENTE;
	}
	
	
	
	@Override
	public int compare(Persona p1, Persona p2) {

		if(p1.getEdad()>p2.getEdad()) {
			
			if(criterioEdad == ORDENACION_ASCENDENTE) return 1;
			else return -1;
		}
		else if(p1.getEdad()<p2.getEdad()) {
			
			if(criterioEdad == ORDENACION_ASCENDENTE) return -1;
			else return 1;
		}
		// igualdad de edades
		else {
			
			if(p1.getPeso()>p2.getPeso()) {
				
				if(criterioPeso == ORDENACION_ASCENDENTE) return 1;
				else return -1;
			}
			else if(p1.getPeso()<p2.getPeso()) {
				
				if(criterioPeso == ORDENACION_ASCENDENTE) return -1;
				else return 1;
			}
			else return 0;
		}
		
		
	}

	
	
	/**
	 * establece el criterio para la ordenación de pesos, ascendente o descendente 
	 * @param metodoPeso el criterio escogido de entre los disponibles
	 */
	public void setMetodoOrdenacionPeso(int metodoPeso) {
		
		criterioPeso = metodoPeso;
	}


	
	/**
	 * establece el criterio para la ordenación de edades, ascendente o descendente 
	 * @param metodoEdad el criterio escogido de entre los disponibles
	 */
	public void setMetodoOrdenacionEdad(int metodoEdad) {
		
		criterioEdad = metodoEdad;
	}
	
	
	
	
}
