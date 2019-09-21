package com.marcos.misListas.negocio;

import java.util.ArrayList;
import java.util.Iterator;

import com.marcos.misListas.beans.Persona;
import com.marcos.misListas.error.FueraDeRangoException;

public class ListaPersonas {

	// Usaremos un arrayList internamente para funcionar
	//private ArrayList<Persona> listaInterna;
	private ArrayList<Persona> listaInterna;
	
	
	
	public ListaPersonas() {
		
		listaInterna = new ArrayList<Persona>();
	}
	
	
	
	
	/**
	 * Esta operacion introduce un objeto Persona en la
	 * ListaPersonas
	 * 
	 * @param persona Persona a insertar
	 */
	public void addPersona(Persona persona) {
		
		// uso la lista interna y me ayudo de ella
		listaInterna.add(persona);
	}
	
	
	
	/**
	 * Tama�o de la lista
	 * 
	 * @return el numero de elementos que posee la lista
	 */
	public int getElementos() {
		
		// devuelvo el tamanio de la lista
		return listaInterna.size();
	}
	
	
	
	
	
	/**
	 * Recoge la Persona indicada por el �ndice
	 * 
	 * @param index la posici�n de la Persona solicitada
	 * @return El objeto Persona en esa posici�n
	 * @throws FueraDeRangoException error producido 
	 */
	public Persona getPersona(int index) throws FueraDeRangoException {
		
		if((index>=0)&&(index<listaInterna.size())) {
			
			return listaInterna.get(index);	
		}
		
		throw new FueraDeRangoException("Te has colado en el tama�o");
		
	}

	
	
	
	public Iterator<Persona> getPersonas() {
		
		return listaInterna.iterator();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
