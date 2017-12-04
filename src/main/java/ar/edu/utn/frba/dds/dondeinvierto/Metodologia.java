package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.List;
import java.util.stream.Collectors;

public class Metodologia {

	private List<Empresa> empresas;
	private String nombre;
	private List<Regla> reglas;
	
	public Metodologia(List<Empresa> empresas, String nombre, List<Regla> reglas) {
		super();
		this.empresas = empresas;
		this.nombre = nombre;
		this.reglas = reglas;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Regla> getReglas() {
		return reglas;
	}
	
	public List<ResultadoRegla> ejecutar() {
		List<ResultadoRegla> listaResultados = encapsularEmpresas();
		for (Regla regla : reglas)
			listaResultados = regla.ejecutar(listaResultados);
//			.forEach(regla -> listaResultados = regla.ejecutar(listaResultados));
		return listaResultados;
//				.flatMap(List::stream).collect(Collectors.toList());
//		return reglas.stream().map(regla -> regla.ejecutar(encapsularEmpresas())).flatMap(List::stream).collect(Collectors.toList());
	}

	private List<ResultadoRegla> encapsularEmpresas() {
		return empresas.stream().map(empresa -> new ResultadoRegla(empresa)).collect(Collectors.toList()) ;
	}
}
