package modeloRangoNumerico01;

public class RangoNumerico<T extends Number> {

	T min;
	T max;

	public RangoNumerico(T min, T max) {
		super();
		this.min = min;
		this.max = max;
	}

	public boolean isInRango(T valor) {
		double valorDouble = valor.doubleValue();
		double minDouble = min.doubleValue();
		double maxDouble = max.doubleValue();
		return valorDouble >= minDouble && valorDouble <= maxDouble;
	}
}
