package modeloFilter03;

import java.util.List;

import modeloFilterFactory04.FiltroAlmacenamientoConcreto;
import modeloFilterFactory04.FiltroNFCConcreto;
import modeloFilterFactory04.FiltroOtroConcreto;
import modeloFilterFactory04.FiltroPrecioConcreto;

public class Prueba {
	public static void main(String[] args) {
		// filtro numerico
		List<Movil> movils = new MovilOM().getMovils();		
		Criterio filtros=new Criterio();
		System.out.println("comparacion con rango");
		filtros.add(new FiltroPrecioConcreto(200, 400));
		filtros.add(new FiltroOtroConcreto (0.5f, 4.3f));
		filtros.add(new FiltroNFCConcreto(true));
//		filtros.add(new FiltroAlmacenamiento(32,256));
		List<Movil> filtrar = filtros.filtrar(movils);
		System.out.println(filtrar);
		System.out.println(filtrar.size());
	}
}
