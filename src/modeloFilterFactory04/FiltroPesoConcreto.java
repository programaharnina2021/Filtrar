package modeloFilterFactory04;

import modeloFilter03.Movil;

public class FiltroPesoConcreto extends FiltroNumericoAbstracto<Long,Movil> {

	public FiltroPesoConcreto(Long min, Long max) {
		super(min, max);
	}

	@Override
	public boolean filtrarElement(Movil elemento) {
		return filtrar(elemento.getPeso());
	}

	

}
