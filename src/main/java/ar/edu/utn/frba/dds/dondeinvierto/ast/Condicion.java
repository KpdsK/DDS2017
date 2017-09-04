package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class Condicion implements ExpresionASA {
	private ExpresionASA expresion;

	public Condicion(ExpresionASA nombreCuenta) {
		super();
		this.expresion = nombreCuenta;
	}

	@Override
	public Object ejecutar() {
		return (boolean) expresion.ejecutar();
	}
}