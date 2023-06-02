package modeloRangoFilter02;

import java.util.List;


public class Prueba {
	public static void main(String[] args) {
		// filtro numerico
		List<Movil> movils = new MovilOM().getMovils();		
		System.out.println("comparacion con rango");
		FiltroNumerico<Integer> precioRango=new FiltroNumerico(300, 400);
		for (Movil movil : movils) {
			if(precioRango.filtrar(movil.getPrecio()))
				System.out.println(movil);
		}
		System.out.println("filtrando otro");
		FiltroNumerico<Float> otroRango=new FiltroNumerico(1.5f, 2.3f);
		for (Movil movil : movils) {
			if(otroRango.filtrar(movil.getOtro()))
				System.out.println(movil);
		}
		int precioMin = 300;
		int precioMax = 400;
		for (Movil movil : movils) {
			// hay un comportamiento
			if (movil.getPrecio() >= precioMin && movil.getPrecio() <= precioMax) {
				System.out.println(movil);
			}
		}
		System.out.println("nfc");
		FiltroBooleano nfcRango=new FiltroBooleano(false);
		for (Movil movil : movils) {
			if(nfcRango.filtrar(movil.isNfc()))
				System.out.println(movil);
		}
		
		
	}
}
