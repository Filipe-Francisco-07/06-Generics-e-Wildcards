package Lower_GenericWildcards;

import java.util.List;

public class LowerBoundedWildcards {

	//ex1
	public <T> void copiarElementos(List<? super T> destino, List<? extends T> origem) {
	    destino.addAll(origem);
	}
	//ex2
	public void addUno(List<? super Uno> garagemUno) {
	   garagemUno.add(new UnoFire());
	   System.out.println("Uno adicionado");
	}
	
}
