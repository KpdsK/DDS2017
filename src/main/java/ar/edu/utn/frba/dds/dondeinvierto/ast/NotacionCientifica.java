package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class NotacionCientifica extends OperacionesBinarias {
	
	public NotacionCientifica(ExpresionASA operador1, ExpresionASA operador2) {
		super(operador1, operador2);
	}

	@Override
	protected Object operar(Object operador1, Object operador2) {
		return (double)operador1 * (Math.pow(10, (double)operador2));
	}
}