package application.model;

import java.time.LocalDate;

/**
 * Class Medico
 * Created 19/01/2023
 * @author GeronimoBasso
 *
 */
public class Medico{

	private String emailUsuario;
	private String nombre;
	private String apellido;
	private String password;
	private String especialidad;
	private int telefono;
	private String domicilio;
	private String sexo;
	private LocalDate fechaEntrada;
	
	/**
	 * Constructor class Medico
	 * @param emailUsuario
	 * @param nombre
	 * @param apellido
	 * @param password
	 * @param especialidad
	 * @param telefono
	 * @param domicilio
	 * @param sexo
	 * @param fechaEntrada
	 */
	public Medico(String emailUsuario, String nombre, String apellido, String password, String especialidad,int telefono, String domicilio, String sexo, LocalDate fechaEntrada) {
		this.emailUsuario = emailUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.especialidad = especialidad;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.sexo = sexo;
		this.fechaEntrada = fechaEntrada;
	}
	
	public Medico() {
		
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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
