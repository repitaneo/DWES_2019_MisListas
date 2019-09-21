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
		
		for(int i=0;i<lista.getElementos();i++) {
			
			// probamos que no haya errores e imprimimos la información
			try {
				
				Persona persona = lista.getPersona(i);

				System.out.println("**************");
				System.out.println(persona.getNombre());
			} 
			catch (FueraDeRangoException e) {
			}
			
		}
		
		
	}
	
	
	
	/**
	 * Imprime con un iterador
	 * @param lista iterador de Persona
	 */
	public static void imprimirListaPersonas(Iterator<Persona> lista) {
		
		while(lista.hasNext()) {
		
			Persona persona = lista.next();
			System.out.println("**************");
			System.out.println(persona.getNombre());			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
