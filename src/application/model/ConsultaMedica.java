package application.model;

import java.time.LocalDate;

public class ConsultaMedica {
	
	private String identificadorConsulta;
	private String descripcion;
	private LocalDate fechaConslta;
	private Prisionero prisionero;
	private Medico medico;

	
	public ConsultaMedica(String identificadorConsulta, String descripcion, LocalDate fechaConslta , Prisionero prisionero , Medico medico) {
		super();
		this.identificadorConsulta = identificadorConsulta;
		this.descripcion = descripcion;
		this.fechaConslta = fechaConslta;
		this.prisionero = prisionero;
		this.medico = medico;
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

	public String getIdentificadorConsulta() {
		return identificadorConsulta;
	}

	public void setIdentificadorConsulta(String identificadorConsulta) {
		this.identificadorConsulta = identificadorConsulta;
	}

	public Prisionero getPrisionero() {
		return prisionero;
	}

	public void setPrisionero(Prisionero prisionero) {
		this.prisionero = prisionero;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
}
