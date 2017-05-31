package ar.edu.utn.frba.dds.dondeinvierto.ast;

public abstract class OperacionesBinarias implements NodoAST {

	private NodoAST operador1, operador2;

	public OperacionesBinarias(NodoAST operador1, NodoAST operador2) {
		super();
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	
	@Override
	public Object execute() {
		return operar(operador1.execute(), operador2.execute());
	}

	protected abstract Object operar(Object operador1, Object operador2);
}