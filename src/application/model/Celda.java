package application.model;

public class Celda {
	
	private int numeroCelda;
	private int piso;
	private boolean esCompartida;
	private int cantidadVentanas;
	private int metrosCuadrados;
	
	public Celda(int numeroCelda, int piso, boolean esCompartida, int cantidadVentanas, int metrosCuadrados) {
		super();
		this.numeroCelda = numeroCelda;
		this.piso = piso;
		this.esCompartida = esCompartida;
		this.cantidadVentanas = cantidadVentanas;
		this.metrosCuadrados = metrosCuadrados;
	}
	
	public Celda() {
	}

	public int getNumeroCelda() {
		return numeroCelda;
	}

	public void setNumeroCelda(int numeroCelda) {
		this.numeroCelda = numeroCelda;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public boolean isEsCompartida() {
		return esCompartida;
	}

	public void setEsCompartida(boolean esCompartida) {
		this.esCompartida = esCompartida;
	}

	public int getCantidadVentanas() {
		return cantidadVentanas;
	}

	public void setCantidadVentanas(int cantidadVentanas) {
		this.cantidadVentanas = cantidadVentanas;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
}
