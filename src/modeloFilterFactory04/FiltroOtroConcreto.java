package modeloFilterFactory04;

import modeloFilter03.Movil;

public class FiltroOtroConcreto extends FiltroNumericoAbstracto<Float,Movil> {

	public FiltroOtroConcreto(Float min, Float max) {
		super(min, max);
	}

	@Override
	public boolean filtrarElement(Movil valor) {
		return filtrar(valor.getOtro());
	}

	

}
