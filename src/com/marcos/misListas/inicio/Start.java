package com.marcos.misListas.inicio;

import com.marcos.misListas.beans.Persona;
import com.marcos.misListas.error.FueraDeRangoException;
import com.marcos.misListas.negocio.ListaPersonas;
import com.marcos.misListas.print.ImprimirConsola;

public class Start {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		Persona persona1 = new Persona();
		persona1.setNombre("Maria");
		persona1.setApellidos("López");
		persona1.setTelefono("656784356");
		persona1.setCiudad("Oviedo");
		persona1.setEdad(27);
		persona1.setPeso(56);
		
		
		ListaPersonas lista = new ListaPersonas();
		lista.addPersona(persona1);
		
		ImprimirConsola.imprimirListaPersonas(lista);
		ImprimirConsola.imprimirListaPersonas(lista.getElementos());

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
