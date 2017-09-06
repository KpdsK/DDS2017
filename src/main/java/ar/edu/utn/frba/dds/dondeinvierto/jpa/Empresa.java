package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	  @Id
	  @GeneratedValue
	  private Integer id;
	  private String nombre;

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
}
