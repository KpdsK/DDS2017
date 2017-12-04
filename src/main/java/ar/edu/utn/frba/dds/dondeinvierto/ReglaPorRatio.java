package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReglaPorRatio extends Regla {

	public ReglaPorRatio(String expresion, int periodo, List<Operable> indicadores) {
		super(expresion, periodo, indicadores);
	}

	@Override
	public List<ResultadoRegla> ejecutar(List<ResultadoRegla> resultadosEmpresas) {
		List<ResultadoRegla> lista = resultadosEmpresas.stream().map(
				resultadoEmpresa -> resultadoEmpresa.setRatio(obtenerPeriodo(periodo).stream().mapToDouble(
				anio -> Evaluador.evaluarExpresion(expresion, 
						obtenerOperablesSegunAnio(resultadoEmpresa.getEmpresa(), anio))).sum()/(periodo+1)))
				.collect(Collectors.toList());
		lista.sort(Comparator.comparing(ResultadoRegla::getRatio));
		Collections.reverse(lista);
		return lista;
	}

}