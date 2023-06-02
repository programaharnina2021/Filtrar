package modeloFilter03;

import java.util.ArrayList;
import java.util.List;

import modeloFilterFactory04.FilterBasico;

public class Criterio {
	private List<FilterBasico<Movil>> filtros;

	public boolean add(FilterBasico<Movil> e) {
		return filtros.add(e);
	}


	public Criterio(List<FilterBasico<Movil>> lista) {
		super();
		this.filtros = lista;
	}
	
	public Criterio() {
		super();
		this.filtros=new ArrayList<>();
	}

	public List<Movil> filtrar(List<Movil> moviles){
		for (FilterBasico<Movil> filter : filtros) {
			moviles=moviles.stream().filter(filter::filtrarElement).toList();
		}
		return moviles;
	}
}
