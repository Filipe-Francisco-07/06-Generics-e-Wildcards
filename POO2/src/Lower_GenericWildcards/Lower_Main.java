package Lower_GenericWildcards;

import java.util.ArrayList;
import java.util.List;

public class Lower_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ex1
		LowerBoundedWildcards lbw = new LowerBoundedWildcards();
		
		List<Object> listaDestino = new ArrayList<>();
	    List<String> listaOrigemS = new ArrayList<>();
	    List<Integer> listaOrigemI = new ArrayList<>();
	    listaOrigemS.add("Olá, tudo bem?");
	    listaOrigemI.add(123);

	    lbw.copiarElementos(listaDestino, listaOrigemS);
	    lbw.copiarElementos(listaDestino, listaOrigemI);

	    for (Object item : listaDestino) {
	        System.out.println(item);
	    }
		
	    //ex2
	    
	    List<Carro> garagemCarro= new ArrayList<Carro>();
	    List<Uno> garagemUno= new ArrayList<Uno>();
	    //List<UnoFire> garagemUnoFire= new ArrayList<UnoFire>();
	    //List<Palio> garagemPalio= new ArrayList<Palio>();

	    lbw.addUno(garagemCarro);
	    lbw.addUno(garagemUno);

	    //erros na compilacao
	    //lbw.addUno(garagemUnoFire);
	    //addUno.addMethod(garagemPalio); 
	   }

}
