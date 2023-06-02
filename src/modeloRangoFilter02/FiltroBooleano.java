package modeloRangoFilter02;

public class FiltroBooleano implements Filter<Boolean>{
	boolean otro;

	public FiltroBooleano(boolean valor) {
		super();
		this.otro = valor;
	}

	@Override
	public boolean filtrar(Boolean valor) {
		return valor==otro;
	}
	
}
