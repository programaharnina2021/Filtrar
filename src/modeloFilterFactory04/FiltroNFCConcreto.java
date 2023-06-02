package modeloFilterFactory04;

import modeloFilter03.Movil;

public class FiltroNFCConcreto extends FiltroBooleanoAbstracto<Movil> {

	public FiltroNFCConcreto(boolean valor) {
		super(valor);
	}

	@Override
	public boolean filtrarElement(Movil elemento) {
		return otro==elemento.isNfc();
	}

	
	

	
}
