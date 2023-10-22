package Unbounded_GenericWildcards;
import java.util.List;

//ex1
public class UnboundedWildcards {
	
	public void sampleMethod(List<?> col){
		for (Object ele : col) {
			System.out.print(ele+" ");
		}
		System.out.println("");
	}
  //ex2 
	public void printaListas(List<?> lista) {
		for (Object e: lista)
			System.out.print(e + " ");
		System.out.println();
	}

}