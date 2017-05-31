package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class Potencia extends OperacionesBinarias {
	
	public Potencia(ExpresionASA operador1, ExpresionASA operador2) {
		super(operador1, operador2);
	}

	@Override
	protected Object operar(Object operador1, Object operador2) {
		return Math.pow((double)operador1, (double)operador2);
	}
}