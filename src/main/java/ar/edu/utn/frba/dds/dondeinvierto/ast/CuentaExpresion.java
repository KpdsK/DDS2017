package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class CuentaExpresion implements ExpresionASA {
	private String nombreCuenta;

	public CuentaExpresion(String nombreCuenta) {
		super();
		this.nombreCuenta = nombreCuenta;
	}

	@Override
	public Object ejecutar() {
		return 2.9;
	}
}