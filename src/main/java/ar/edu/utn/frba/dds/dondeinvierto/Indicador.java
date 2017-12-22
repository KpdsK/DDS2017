package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser;
import ar.edu.utn.frba.dds.dondeinvierto.ast.PruebasBaseListener;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.ManejadorPersistencia;

public class Indicador implements Operable {
	private String expresionIndicador;
	private String nombre;

	public Indicador(String nombre, String expresionIndicador) {
		super();
		this.expresionIndicador = expresionIndicador;
		this.nombre = nombre;
	}

	public String getExpresionIndicador() {
		return expresionIndicador;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public double operar(List<Operable> listaOperable) {
		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresionIndicador));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoParser parser = new DondeInviertoParser( tokens, listaOperable);
		DondeInviertoParser.IdentificadorContext tree = parser.identificador();
		ParseTreeWalker walker = new ParseTreeWalker();
		PruebasBaseListener listener = new PruebasBaseListener(); 
		walker.walk(listener , tree);
		return listener.getResultadoExpresion();
	}

	public List<ResultadoRegla> ejecutar() {
		List<ResultadoRegla> lista = encapsularEmpresas().stream().map(
				resultadoEmpresa -> resultadoEmpresa.setRatio(
				Evaluador.evaluarExpresion(expresionIndicador,
				obtenerOperablesSegunAnio(resultadoEmpresa.getEmpresa()
				, 2017)))).collect(Collectors.toList());
		lista.sort(Comparator.comparing(ResultadoRegla::getRatio));
		Collections.reverse(lista);
		return lista;
	}

	protected List<Operable> obtenerOperablesSegunAnio(Empresa empresa, int anio) {
		List<Operable> lista = listaCuentasSegunAnio(empresa, anio);
		lista.addAll(ManejadorPersistencia.listaIndicadoresEjecutables());
		return lista;
	}
	
	protected List<Operable> listaCuentasSegunAnio(Empresa empresa, int anio) {
		return empresa.getCuentas().stream().filter(cuenta -> cuenta.getAnio() == anio)
				.collect(Collectors.toList());
	}
	
	private List<ResultadoRegla> encapsularEmpresas() {
		return ManejadorPersistencia.listaEmpresasEjecutables().stream().map(empresa -> new ResultadoRegla(empresa)).collect(Collectors.toList());
	}
	
	public String obtenerResultadosParaWeb() {
		String cadenaResultado = "";
		for (ResultadoRegla resultado: this.ejecutar()){
			cadenaResultado += "[\"" + resultado.getEmpresa().getNombre() + "\",\"" 
							+ Double.toString(resultado.getRatio()) + "\"],";  
		}
		return cadenaResultado.isEmpty() ? cadenaResultado : "[" + cadenaResultado.substring(0, cadenaResultado.length() -1) + "]";
	}
}