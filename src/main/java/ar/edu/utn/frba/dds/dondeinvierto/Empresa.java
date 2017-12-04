package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.List;

public class Empresa {

	private List<Cuenta> cuentas;
	private String nombre;
	private int antiguedad;

	public Empresa(List<Cuenta> cuentas, String nombre, int antiguedad) {
		super();
		this.cuentas = cuentas;
		this.nombre = nombre;
		this.antiguedad = antiguedad;
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}
	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	//TODO: Hacer metodo obtener cuentas segun periodo, año, nombre, criterios distintos. Con lambdas
}
