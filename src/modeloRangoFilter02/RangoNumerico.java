package modeloRangoFilter02;

public class RangoNumerico<T extends Number> {

	T min;
	T max;

	public RangoNumerico(T min, T max) {
		super();
		this.min = min;
		this.max = max;
	}

	
	public T getMin() {
		return min;
	}

	public T getMax() {
		return max;
	}
	
}
