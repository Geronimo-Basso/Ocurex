package application.model;

import java.time.LocalDate;

public class ConsultaMedica {
	
	private String idConsulta;
	private String descripcion;
	private LocalDate fechaConslta;
	private String idPreso;
	private String nombrePreso;
	private String apellidoPreso;
	private String idMedico;
	
	public ConsultaMedica(String idConsulta, String descripcion, LocalDate fechaConslta, String idPreso,
			String nombrePreso, String apellidoPreso, String idMedico) {
		this.idConsulta = idConsulta;
		this.descripcion = descripcion;
		this.fechaConslta = fechaConslta;
		this.idPreso = idPreso;
		this.nombrePreso = nombrePreso;
		this.apellidoPreso = apellidoPreso;
		this.idMedico = idMedico;
	}

	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaConslta() {
		return fechaConslta;
	}

	public void setFechaConslta(LocalDate fechaConslta) {
		this.fechaConslta = fechaConslta;
	}

	public String getIdPreso() {
		return idPreso;
	}

	public void setIdPreso(String idPreso) {
		this.idPreso = idPreso;
	}

	public String getNombrePreso() {
		return nombrePreso;
	}

	public void setNombrePreso(String nombrePreso) {
		this.nombrePreso = nombrePreso;
	}

	public String getApellidoPreso() {
		return apellidoPreso;
	}

	public void setApellidoPreso(String apellidoPreso) {
		this.apellidoPreso = apellidoPreso;
	}

	public String getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(String idMedico) {
		this.idMedico = idMedico;
	}

	
}
