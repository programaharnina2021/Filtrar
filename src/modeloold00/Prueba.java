package modeloold00;

import java.util.List;

public class Prueba {
	public static void main(String[] args) {
		// filtro numerico
		List<Movil> movils = new MovilOM().getMovils();
		// hay un rango
		System.out.println("comparacion con primitivos");
		int precioMin = 300;
		int precioMax = 400;
		for (Movil movil : movils) {
			// hay un comportamiento
			if (movil.getPrecio() >= precioMin && movil.getPrecio() <= precioMax) {
				System.out.println(movil);
			}
		}
		System.out.println("comparacion con rango");
		Rango precioRango=new Rango(300, 400);
		for (Movil movil : movils) {
			if(precioRango.isInRango(movil.getPrecio()))
				System.out.println(movil);
		}
		System.out.println("filtrando ram");
		Rango rangoRam=new Rango(5, 6);
		for (Movil movil : movils) {
			if(rangoRam.isInRango(movil.getRam()))
				System.out.println(movil);
		}
//		Rango otroRango=new Rango(1.5f, 2.3f);
		
	}
}
