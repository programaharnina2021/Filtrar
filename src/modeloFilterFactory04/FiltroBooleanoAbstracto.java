package modeloFilterFactory04;

public abstract class FiltroBooleanoAbstracto<S> implements FilterBasico<S>{
	protected boolean otro;

	public FiltroBooleanoAbstracto(boolean valor) {
		super();
		this.otro = valor;
	}

	
}
