package application.model;

import java.time.LocalDate;

/**
 * 
 * @author GeronimoBasso
 * @deprecated
 */
public class Usuario {
	private String emailUsuario;
	private String nombre;
	private String apellido;
	private int telefono;
	private String domicilio;
	private String sexo;
	private LocalDate fechaEntrada;
	
	public Usuario(String emailUsuario, String nombre, String apellido, int telefono, String domicilio,String sexo, LocalDate fechaEntrada) {
		this.emailUsuario = emailUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.sexo = sexo;
		this.fechaEntrada = fechaEntrada;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
}
