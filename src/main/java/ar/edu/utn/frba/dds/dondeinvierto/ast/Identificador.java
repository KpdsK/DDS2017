package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class Identificador implements ExpresionASA {
	private String nombreCuenta;

	public Identificador(String nombreCuenta) {
		super();
		this.nombreCuenta = nombreCuenta;
	}

	@Override
	public Object ejecutar() {
		return nombreCuenta;
	}
}