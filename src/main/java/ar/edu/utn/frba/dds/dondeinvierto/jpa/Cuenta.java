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
	  private double valor;
	  private String nombre;

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
		    return nombre;
		  }
		  
		  public Cuenta setNombre(String nombre) {
			    this.nombre = nombre;
			    return this;
		  }
}
