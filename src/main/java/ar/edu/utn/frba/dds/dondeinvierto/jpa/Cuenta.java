package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {
	  public Cuenta(String nombre, double valor, int anio) {
		super();
		this.valor = valor;
		this.nombre = nombre;
		this.anio = anio;
	}

	public Cuenta() {
		super();
	}

	@Id
	  @GeneratedValue
	  private Integer id;
	  private double valor;
	  private String nombre;
	  private int anio;
	  public int getAnio() {
		return anio;
	}

	public Cuenta setAnio(int anio) {
		this.anio = anio;
		return this;
	}

	@ManyToOne
	  @JoinColumn(name="idEmpresa")
	  protected Empresa empresa;

	  public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Integer getId() {
	    return id;
	  }

	  public Cuenta setId(Integer id) {
	    this.id = id;
	    return this;
	  }

	  public double getValor() {
	    return valor;
	  }
	  
	  public Cuenta setValor(double valor) {
		    this.valor = valor;
		    return this;
	  }
	  
	  public String getNombre() {
		    return nombre.substring(3);
		  }
		  
		  public Cuenta setNombre(String nombre) {
			    this.nombre = nombre;
			    return this;
		  }

		public ar.edu.utn.frba.dds.dondeinvierto.Cuenta construirCuentaEjecutable() {
			return new ar.edu.utn.frba.dds.dondeinvierto.Cuenta(this.nombre, this.getValor(), this.getAnio());
		}
}
