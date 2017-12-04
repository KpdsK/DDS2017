package ar.edu.utn.frba.dds.dondeinvierto;


public class ResultadoRegla {

	private Empresa empresa;
	private double ratio;
	
	public ResultadoRegla(Empresa empresa) {
		super();
		this.empresa = empresa;
		this.ratio = 0;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public double getRatio() {
		return ratio;
	}

	public ResultadoRegla setRatio(double valor) {
		ratio =  ratio + valor;
		return this;
	}
	
}
