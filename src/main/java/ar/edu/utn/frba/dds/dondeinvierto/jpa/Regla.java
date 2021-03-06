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

@Entity
@Table(name = "Regla")
public abstract class Regla {
	public Regla() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Metodologia getMetodologia() {
		return metodologia;
	}
	public void setMetodologia(Metodologia metodologia) {
		this.metodologia = metodologia;
	}
	public String getExpresion() {
		return expresion;
	}
	public void setExpresion(String expresion) throws ExpresionInvalidaException {
//		this.expresion = verificarExpresion(expresion);
		this.expresion = expresion;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public Regla(String expresion, int periodo, String idUsuario) throws ExpresionInvalidaException {
		super();
		this.expresion = verificarExpresion(expresion);
		this.periodo = periodo;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	@ManyToOne
	@JoinColumn(name="idMetodologia")
	protected Metodologia metodologia;
	protected String expresion;
	protected String idUsuario;
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	protected int periodo;
	
	protected abstract String verificarExpresion(String expresion) throws ExpresionInvalidaException;
	protected abstract ar.edu.utn.frba.dds.dondeinvierto.Regla construirReglaEjecutable();
}
