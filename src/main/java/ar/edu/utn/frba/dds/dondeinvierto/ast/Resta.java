package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class Resta extends OperacionesBinarias {

	public Resta(NodoAST operador1, NodoAST operador2) {
		super(operador1, operador2);
	}

	@Override
	protected Object operar(Object operador1, Object operador2) {
		return (double)operador1 - (double)operador2;
	}
}
