package Atividade1;

public class Main {

	  public static void main(String[] args) {
		  ArmazenarGenerica<String> string = new ArmazenarGenerica<>("bom dia");
		  ArmazenarGenerica<Boolean> boo = new ArmazenarGenerica<>(true);
		  ArmazenarGenerica<Integer> inte = new ArmazenarGenerica<>(31232);

	      System.out.println(string.getObjeto());
	      System.out.println(boo.getObjeto());
	      System.out.println(inte.getObjeto());
	    }

}
