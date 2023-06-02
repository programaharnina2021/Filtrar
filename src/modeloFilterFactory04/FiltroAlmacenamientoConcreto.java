package modeloFilterFactory04;

import modeloFilter03.Movil;

public class FiltroAlmacenamientoConcreto extends FiltroNumericoAbstracto<Integer,Movil> {

	public FiltroAlmacenamientoConcreto(Integer min, Integer max) {
		super(min, max);
	}

	@Override
	public boolean filtrarElement(Movil elemento) {
		return filtrar(elemento.getRam());
	}

	

}
