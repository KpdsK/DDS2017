package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class Identificador implements NodoAST {
	private String nombreCuenta;

	public Identificador(String nombreCuenta) {
		super();
		this.nombreCuenta = nombreCuenta;
	}

	@Override
	public Object execute() {
		return nombreCuenta;
	}
}