package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import ar.edu.utn.frba.dds.dondeinvierto.ExpresionInvalidaException;

@MappedSuperclass
public abstract class ReglaAbstracta extends Regla {
	public ReglaAbstracta(String expresion, int periodo) throws ExpresionInvalidaException {
		super(expresion, periodo);
	}
}
