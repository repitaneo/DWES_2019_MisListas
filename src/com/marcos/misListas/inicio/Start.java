package com.marcos.misListas.inicio;

import com.marcos.misListas.beans.Persona;
import com.marcos.misListas.error.FueraDeRangoException;
import com.marcos.misListas.negocio.ListaPersonas;
import com.marcos.misListas.negocio.ordenador.OrdenadorPersonas;
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

		
		Persona persona2 = new Persona();
		persona2.setNombre("Paco");
		persona2.setApellidos("García");
		persona2.setTelefono("654321267");
		persona2.setCiudad("Gijón");
		persona2.setEdad(40);
		persona2.setPeso(70);		
		
		
		Persona persona3 = new Persona();
		persona3.setNombre("Rogelio");
		persona3.setApellidos("García");
		persona3.setTelefono("654321267");
		persona3.setCiudad("Gijón");
		persona3.setEdad(10);
		persona3.setPeso(136);	
		
		
		
		ListaPersonas lista = new ListaPersonas();
		lista.addPersona(persona1);
		lista.addPersona(persona2);
		lista.addPersona(persona3);
		
		
		
		
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());

		OrdenadorPersonas op = new OrdenadorPersonas();
		op.ordenatePeso();
		lista.ordenar(op);
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());
		
		op.ordenateEdad();
		lista.ordenar(op);
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
