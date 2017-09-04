package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class OperadorMenorQue extends OperacionesBinarias {
	
	public OperadorMenorQue(ExpresionASA operador1, ExpresionASA operador2) {
		super(operador1, operador2);
	}

	@Override
	protected Object operar(Object operador1, Object operador2) {
		return (double)operador1 < (double)operador2;
	}
}