package com.marcos.misListas.negocio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import com.marcos.misListas.beans.Persona;
import com.marcos.misListas.error.FueraDeRangoException;
import com.marcos.misListas.negocio.ordenador.OrdenadorAscendenteDescendente;
import com.marcos.misListas.negocio.ordenador.OrdenadorPersonas;

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
	 * Tamaño de la lista
	 * 
	 * @return el numero de elementos que posee la lista
	 */
	public int getElementos() {
		
		// devuelvo el tamanio de la lista
		return listaInterna.size();
	}
	
	
	
	
	
	/**
	 * Recoge la Persona indicada por el índice
	 * 
	 * @param index la posición de la Persona solicitada
	 * @return El objeto Persona en esa posición
	 * @throws FueraDeRangoException error producido 
	 */
	public Persona getPersona(int index) throws FueraDeRangoException {
		
		if((index>=0)&&(index<listaInterna.size())) {
			
			return listaInterna.get(index);	
		}
		
		throw new FueraDeRangoException("Te has colado en el tamaño");
		
	}

	
	
	
	
	
	/**
	 * Devuelve un iterador sobre los elementos de la lista
	 * 
	 * @return el iterador para poder recorrer la lista
	 */
	public Iterator<Persona> getPersonas() {
		
		return listaInterna.iterator();
		
	}
	
	
	
	
	
	
	/**
	 * Ordenador de la lista que necesita un Comparator para poder ordenadarse
	 * @param op Clase que implementa el Comparator de java
	 */
	public void ordenar(Comparator<Persona> ordenador) {
		
		listaInterna.sort(ordenador);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
