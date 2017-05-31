package ar.edu.utn.frba.dds.dondeinvierto.ast;

public class Constante implements ExpresionASA {
	private double constante;
	public Constante(String constante) {
		this.constante = Double.parseDouble(constante);
	}

	public Constante(double constante) {
		this.constante = constante;
	}
	@Override
	public Object ejecutar() {
		return constante;
	}
}