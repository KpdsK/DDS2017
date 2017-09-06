package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "indicador")
public class Indicador {
	  @Id
	  @GeneratedValue
	  private Integer id;
	  private String expresion;

	  public Integer getId() {
	    return id;
	  }

	  public Indicador setId(Integer id) {
	    this.id = id;
	    return this;
	  }

	  public String getExpresion() {
	    return expresion;
	  }
	  
	  public Indicador setExpresion(String expresion) {
		    this.expresion = expresion;
		    return this;
	  }
}
