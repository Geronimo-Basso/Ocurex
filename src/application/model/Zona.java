package application.model;

public class Zona {
	
	private String nombre;
	private int conteo;
	
	public Zona(String nombre, int conteo) {
		this.nombre = nombre;
		this.conteo = conteo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getConteo() {
		return conteo;
	}

	public void setConteo(int conteo) {
		this.conteo = conteo;
	}

	public int aumentarConteo(int conteo) {
		return conteo++;
	}
	
	public int disminuirConteo(int conteo) {
		return conteo--;
	}
	
}
