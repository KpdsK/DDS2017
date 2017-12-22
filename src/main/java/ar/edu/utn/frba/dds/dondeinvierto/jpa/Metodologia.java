package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ar.edu.utn.frba.dds.dondeinvierto.jpa.Cuenta;
import ar.edu.utn.frba.dds.dondeinvierto.ExpresionInvalidaException;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser;

@Entity
@Table(name = "metodologia")
public class Metodologia {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nombre;
	@OneToMany(mappedBy="metodologia", cascade = CascadeType.ALL)
	private List<Regla> reglas;
	private String idUsuario;

	public String getIdUsuario() {
		return idUsuario;
	}

	public Metodologia setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public Metodologia setId(Integer id) {
		this.id = id;
		return this;
	}

	public List<Regla> getReglas() {
		return reglas;
	}

	public Metodologia setReglas(List<Regla> reglas) throws ExpresionInvalidaException {
		this.reglas = reglas;
		reglas.forEach(regla -> regla.setMetodologia(this));
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public Metodologia setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public ar.edu.utn.frba.dds.dondeinvierto.Metodologia construirMetodologiaEjecutable() {
		return new ar.edu.utn.frba.dds.dondeinvierto.Metodologia(ManejadorPersistencia.listaEmpresasEjecutables(), this.nombre, obtenerReglasEjecutables());
	}

	private List<ar.edu.utn.frba.dds.dondeinvierto.Regla> obtenerReglasEjecutables() {
		return reglas.stream().map(regla -> regla.construirReglaEjecutable()).collect(Collectors.toList());
	}
}