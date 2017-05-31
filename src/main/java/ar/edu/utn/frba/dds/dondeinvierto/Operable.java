package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.List;

public interface Operable {

	public double operar(List<Operable> listaOperable);
	public String getNombre();
}
