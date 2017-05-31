package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class Division extends OperacionesBinarias {
	
	public Division(NodoAST operador1, NodoAST operador2) {
		super(operador1, operador2);
	}

	@Override
	protected Object operar(Object operador1, Object operador2) {
		//TODO: generar excepcion para tratar la division por 0
		return (double)operador1 / (double)operador2;
	}
}