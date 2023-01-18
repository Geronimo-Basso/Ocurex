package application.model;
import java.time.LocalDate;

public class Expediente {
	
	private LocalDate fechaCondena;
	private String condena;
	private String delito;
	private LocalDate fechaSalida;
	
	public Expediente(LocalDate fechaCondena, String condena, String delito, LocalDate fechaSalida) {
		super();
		this.fechaCondena = fechaCondena;
		this.condena = condena;
		this.delito = delito;
		this.fechaSalida = fechaSalida;
	}
	
	public Expediente() {
	}

	public LocalDate getFechaCondena() {
		return fechaCondena;
	}

	public void setFechaCondena(LocalDate fechaCondena) {
		this.fechaCondena = fechaCondena;
	}

	public String getCondena() {
		return condena;
	}

	public void setCondena(String condena) {
		this.condena = condena;
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
	
}
