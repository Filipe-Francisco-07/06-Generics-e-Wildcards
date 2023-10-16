package UpperGenericWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Upper_Main {

	   public static void main(String args[]) {


		   //ex1
		   UpperBoundedWildcards ubw = new UpperBoundedWildcards();
		   
		      List<Integer> integerList = Arrays.asList(32,12,4);
		      System.out.println("soma: " + ubw.somarQualquerTipo(integerList));

		      List<Double> doubleList = Arrays.asList(14.5, 2.5, 190.2);
		      System.out.println("soma: " + ubw.somarQualquerTipo(doubleList));
		   
		      
		   //ex2
		   List<Long> a2 = new ArrayList<>();

		      a2.add(100L);
		      a2.add(200L);
		      a2.add(300L);

		      ubw.exemplo2(a2);
		         
		   List<Double> a3 = new ArrayList<>();

		      a3.add(21.35);
		      a3.add(56.47);
		      a3.add(78.12);

		      ubw.exemplo2(a3);
		}

}
