package com.marcos.misListas.beans;



/**
 * Bean de la clase Persona
 * @author marcos
 *
 */
public class Persona {

	
	// atributos
	private String nombre;
	private String apellidos;
	private String ciudad;
	private String telefono;
	private int edad;
	private int peso;
	
		
	
	
	
	
	
	/*
	 * SETTER Y GETTERS
	 * 
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", ciudad=" + ciudad + ", telefono="
				+ telefono + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
	
}
