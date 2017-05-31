package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class Indicador implements ExpresionASA {
	private ExpresionASA expresion;

	public Indicador(ExpresionASA nombreCuenta) {
		super();
		this.expresion = nombreCuenta;
	}

	@Override
	public Object ejecutar() {
		return (double) expresion.ejecutar();
	}
	public void cucucu(){
		
	}
}