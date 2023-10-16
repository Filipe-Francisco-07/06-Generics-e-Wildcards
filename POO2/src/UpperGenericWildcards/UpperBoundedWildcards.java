package UpperGenericWildcards;

import java.util.List;

public class UpperBoundedWildcards {

	public double somarQualquerTipo(List<? extends Number> numberlist) {
		double soma = 0.0;
	    for (Number numero : numberlist) soma += numero.doubleValue();
	    return soma;
	}
	
	   public void exemplo2(List<? extends Number> a) {
	         for (Object element : a) {
	             System.out.println(element);
	         }
	    }
}
