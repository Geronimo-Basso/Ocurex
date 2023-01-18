package application.model;

import java.util.Vector;

public class Carcel {
	
	private String nombre;
	private String direccion;
	private Vector<Usuario> usuarios;
	private Vector <Prisionero> prisioneros;
	
	public Carcel(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;		
	}
	
	public Carcel() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Vector<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Vector<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Vector<Prisionero> getPrisioneros() {
		return prisioneros;
	}

	public void setPrisioneros(Vector<Prisionero> prisioneros) {
		this.prisioneros = prisioneros;
	}
	
	
}
