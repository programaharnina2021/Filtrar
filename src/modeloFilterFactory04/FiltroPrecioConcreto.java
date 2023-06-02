package modeloFilterFactory04;

import modeloFilter03.Movil;

public class FiltroPrecioConcreto extends FiltroNumericoAbstracto<Integer,Movil> {
	public FiltroPrecioConcreto(Integer min, Integer max) {
		super(min, max);
	}

	@Override
	public boolean filtrarElement(Movil valor) {
		return filtrar(valor.getPrecio());
	}
}
