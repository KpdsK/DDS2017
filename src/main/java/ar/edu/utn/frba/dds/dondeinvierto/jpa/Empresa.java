package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.edu.utn.frba.dds.dondeinvierto.ExpresionInvalidaException;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.Cuenta;

@Entity
@Table(name = "empresa")
public class Empresa {
	public Empresa() {
		super();
	}

	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	@OneToMany(mappedBy="empresa", cascade = CascadeType.ALL)
	private List<Cuenta> cuentas;
	private int antiguedad;
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public Empresa setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
		cuentas.forEach(cuenta -> cuenta.setEmpresa(this));
		return this;
	}

	public Integer getId() {
		return id;
	}

	public Empresa setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public Empresa setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ar.edu.utn.frba.dds.dondeinvierto.Empresa obtenerEmpresaEjecutable() {
		return new ar.edu.utn.frba.dds.dondeinvierto.Empresa(obtenerCuentasEjecutables(), this.nombre, this.antiguedad);
	}
	
	private List<ar.edu.utn.frba.dds.dondeinvierto.Cuenta> obtenerCuentasEjecutables() {
		return cuentas.stream().map(cuenta -> cuenta.construirCuentaEjecutable()).collect(Collectors.toList());
	}
}
