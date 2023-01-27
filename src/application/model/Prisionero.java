package application.model;

import java.time.LocalDate;

public class Prisionero{
	
	private String identificadorPreso;
	private String nombre;
	private String apellido;
	private String sexo;
	private LocalDate fechaNacimiento;
	private int edad;
	private String delito;
	private LocalDate fechaSalida;
	private int sensorBpm;
	
	public Prisionero(String identificadorPreso, String nombre, String apellido, String sexo, LocalDate fechaNacimiento,int edad, String delito, LocalDate fechaSalida) {
		this.identificadorPreso = identificadorPreso;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.delito = delito;
		this.fechaSalida = fechaSalida;
		this.sensorBpm = 0;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
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

	public String getDelito() {
		return delito;
	}

	public void setDelito(String delito) {
		this.delito = delito;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getSensorBpm() {
		return sensorBpm;
	}

	public void setSensorBpm(int sensorBpm) {
		this.sensorBpm = sensorBpm;
	}

	
}
