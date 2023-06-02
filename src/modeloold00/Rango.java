package modeloold00;

public class Rango {

	int min;
	int max;
	
	public Rango(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	public boolean isInRango(int valor) {
		return valor>=min&&valor<=max;
	}
}
