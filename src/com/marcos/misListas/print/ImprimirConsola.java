package com.marcos.misListas.print;

import java.util.Iterator;

import com.marcos.misListas.beans.Persona;
import com.marcos.misListas.error.FueraDeRangoException;
import com.marcos.misListas.negocio.ListaPersonas;

public class ImprimirConsola {

	
	
	/**
	 * Método estático que me permite imprimir sin que haya un objeto creado
	 * @param lista ListaPersonas a imprimir
	 */
	public static void imprimirListaPersonas(ListaPersonas lista) {
		
		System.out.println("\n\n**************");
		for(int i=0;i<lista.getElementos();i++) {
			
			// probamos que no haya errores e imprimimos la información
			try {
				
				Persona persona = lista.getPersona(i);
				imprimirPrivado(persona);	
			} 
			catch (FueraDeRangoException e) {
			}
			
		}
		
		
	}
	
	
	
	/**
	 * Método estático que imprime con un iterador
	 * @param lista iterador de Persona
	 */
	public static void imprimirListaPersonas(Iterator<Persona> lista) {
		
		System.out.println("\n\n**************");
		while(lista.hasNext()) {
		
			Persona persona = lista.next();
			imprimirPrivado(persona);			
		}
		
	}


	

	private static void imprimirPrivado(Persona persona) {
		System.out.println(persona.getNombre()+" > "+persona.getEdad());
	}
	
	
	
	
	
	
	
	
	
	
}
