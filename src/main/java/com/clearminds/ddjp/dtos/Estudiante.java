package com.clearminds.ddjp.dtos;

public class Estudiante {

	private String nombre;
	private String apellido;
	private int id;
	private Integer edad;

	// Constructor con parametros
	public Estudiante(int id, String nombre, String apellido, int edad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.edad = edad;
	}
	// Constructor con parametros sin id

	public Estudiante(String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Estudiante(String nombre, String apellido, int edad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Estudiante(int id, String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	// Metodo toString
	@Override

	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", edad=" + edad + "]";
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getEdad() {
		if (edad == null || edad == 0)
			return null;
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Estudiante() {

	}

}
