package modeloRangoFilter02;

public class FiltroNumerico<T extends Number> implements Filter<T> {

	RangoNumerico<T> rangoNumerico;
	
	
	public FiltroNumerico(T min,T max) {
		super();
		rangoNumerico=new RangoNumerico<T>(min, max);
	}

	@Override
	public boolean filtrar(T valor) {
		double valorDouble = valor.doubleValue();
		double minDouble =rangoNumerico.getMin().doubleValue();
		double maxDouble = rangoNumerico.getMax().doubleValue();
		return valorDouble >= minDouble && valorDouble <= maxDouble;
	}


}
