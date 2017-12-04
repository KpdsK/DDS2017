package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.List;
import java.util.stream.Collectors;

public class ReglaBooleana extends Regla {

	public ReglaBooleana(String expresion, int periodo, List<Operable> indicadores) {
		super(expresion, periodo, indicadores);
	}

	@Override
	public List<ResultadoRegla> ejecutar(List<ResultadoRegla> resultadosEmpresas) {
		return resultadosEmpresas.stream().filter(
				resultadoEmpresa -> obtenerPeriodo(periodo).stream().allMatch(
										anio -> Evaluador.evaluarCondicion(expresion,
												obtenerOperablesSegunAnio(resultadoEmpresa.getEmpresa(), anio))))
				.collect(Collectors.toList());
	}
}