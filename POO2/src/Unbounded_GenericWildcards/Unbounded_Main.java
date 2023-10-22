package Unbounded_GenericWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unbounded_Main {

	public static void main(String args[]) {
	  
	  UnboundedWildcards uw = new UnboundedWildcards();
	  ArrayList<Integer> col1 = new ArrayList<Integer>();
	  col1.add(24);
	  col1.add(56);
	  col1.add(89);
	  col1.add(75);
	  col1.add(36);
	  uw.sampleMethod(col1);
	  
	  ArrayList<Double> col2 = new ArrayList<Double>();
	  col2.add(24.12d);
	  col2.add(56.25d);
	  col2.add(89.36d);
	  col2.add(75.98d);
	  col2.add(36.47d);
	  uw.sampleMethod(col2);
  	  
  
  	  List<Integer> li = Arrays.asList(1, 2, 3);
  	  List<String>  ls = Arrays.asList("um", "dois", "tres");
  	  
  	  uw.printaListas(li);
  	  uw.printaListas(ls);
  }
}
