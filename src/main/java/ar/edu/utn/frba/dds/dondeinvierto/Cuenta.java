package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.List;

public class Cuenta implements Operable {
	private double valor;
	private String nombre;
	private int anio;
	
	public Cuenta(String nombre, double valor) {
		super();
		this.valor = valor;
		this.nombre = nombre;
	}

	public Cuenta(String nombre, double valor, int anio) {
		super();
		this.valor = valor;
		this.nombre = nombre;
		this.anio = anio;
	}
	
	public double getValor() {
		return valor;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnio() {
		return anio;
	}
	
	@Override
	public double operar(List<Operable> listaOperable) {
		return getValor();
	}

}