package application.model;

import java.time.LocalDate;

public class Prisionero{
	
	private String identificadorPreso;
	private String nombre;
	private String apellido;
	private char sexo;
	private LocalDate fechaNacimiento;
	private int edad;
	
	public Prisionero(String identificadorPreso, String nombre, String apellido, char sexo, LocalDate fechaNacimiento,int edad) {
		this.identificadorPreso = identificadorPreso;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
	}
	
	public Prisionero() {
		
	}
	
	public String getIdentificadorPreso() {
		return identificadorPreso;
	}

	public void setIdentificadorPreso(String identificadorPreso) {
		this.identificadorPreso = identificadorPreso;
	}

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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
