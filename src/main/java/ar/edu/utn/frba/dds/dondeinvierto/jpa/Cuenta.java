package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {
	  @Id
	  @GeneratedValue
	  private Integer id;
	  private String nombre;
	  private String empresa;
	  private String valor;
	  private String periodo;

	  public Integer getId() {
	    return id;
	  }

	  public Cuenta setId(Integer id) {
	    this.id = id;
	    return this;
	  }

	  public String getValor() {
	    return valor;
	  }
	  
	  public Cuenta setValor(String valor) {
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

		public String getEmpresa() {
			return empresa;
		}

		public Cuenta setEmpresa(String empresa) {
			this.empresa = empresa;
			return this;
		}

		public String getPeriodo() {
			return periodo;
		}

		public Cuenta setPeriodo(String periodo) {
			this.periodo = periodo;
			return this;
		}

}
