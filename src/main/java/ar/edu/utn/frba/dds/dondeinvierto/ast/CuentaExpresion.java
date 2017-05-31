package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class CuentaExpresion implements NodoAST {
	private String nombreCuenta;

	public CuentaExpresion(String nombreCuenta) {
		super();
		this.nombreCuenta = nombreCuenta;
	}

	@Override
	public Object execute() {
		return 2.9;
	}
}