package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.List;

public class Cuenta implements Operable {
	private double valor;
	private String nombre;
	
	public Cuenta(String nombre, double valor) {
		super();
		this.valor = valor;
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public double operar(List<Operable> listaOperable) {
		return getValor();
	}
}