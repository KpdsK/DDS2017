package ar.edu.utn.frba.dds.dondeinvierto.ast;

public abstract class OperacionesBinarias implements ExpresionASA {

	private ExpresionASA operador1, operador2;

	public OperacionesBinarias(ExpresionASA operador1, ExpresionASA operador2) {
		super();
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	
	@Override
	public Object ejecutar() {
		return operar(operador1.ejecutar(), operador2.ejecutar());
	}

	protected abstract Object operar(Object operador1, Object operador2);
}