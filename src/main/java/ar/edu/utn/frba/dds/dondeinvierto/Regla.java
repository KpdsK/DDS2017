package ar.edu.utn.frba.dds.dondeinvierto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Regla {

	protected String expresion;
	protected List<Operable> indicadores;
	protected int periodo;
	
	public Regla(String expresion, int periodo, List<Operable> indicadores) {
		super();
		this.expresion = expresion;
		this.periodo = periodo;
		this.indicadores = indicadores;
	}
	
	public abstract List<ResultadoRegla> ejecutar(List<ResultadoRegla> empresas);

	protected List<Integer> obtenerPeriodo(int periodo) {
		List<Integer> lista=new ArrayList<Integer>();
		for(int i=LocalDateTime.now().getYear() - periodo; i <= LocalDateTime.now().getYear(); i++){
			lista.add(i);
		}
		return lista;
	}

	protected List<Operable> listaCuentasSegunAnio(Empresa empresa, int anio) {
		return empresa.getCuentas().stream().filter(cuenta -> cuenta.getAnio() == anio)
				.collect(Collectors.toList());
	}
	
	protected List<Operable> getIndicadores() {
		return this.indicadores;
	}
	protected List<Operable> obtenerOperablesSegunAnio(Empresa empresa, int anio) {
		List<Operable> lista = listaCuentasSegunAnio(empresa, anio);
		lista.addAll(getIndicadores());
		return lista;
	}
	
	
	
	
}
