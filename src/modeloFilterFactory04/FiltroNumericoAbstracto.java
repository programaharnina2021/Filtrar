package modeloFilterFactory04;

public abstract class FiltroNumericoAbstracto<T extends Number,S> implements FilterBasico<S> {

	protected RangoNumerico<T> rangoNumerico;
	
	
	protected boolean filtrar(T valor) {
		double minDouble =rangoNumerico.getMin().doubleValue();
		double maxDouble = rangoNumerico.getMax().doubleValue();
		return valor.doubleValue() >= minDouble && valor.doubleValue() <= maxDouble;
	}
	
	public FiltroNumericoAbstracto(T min,T max) {
		super();
		rangoNumerico=new RangoNumerico<T>(min, max);
	}

}
