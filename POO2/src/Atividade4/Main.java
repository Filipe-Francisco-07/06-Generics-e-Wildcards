package Atividade4;

public class Main {

	public static void main(String[] args) {
		
		
		ArmazenarLista<Integer> inte = new ArmazenarLista<>();
		ArmazenarLista<String> str = new ArmazenarLista<>();

        System.out.println(inte.adicionarChaveValor("A123", 342));
        System.out.println(str .adicionarChaveValor("B123", "Valor"));
        System.out.println(inte.adicionarChaveValor("A123", 500));

        System.out.println(inte.buscarPorChave("A123")); 
        System.out.println(str .buscarPorChave("B123")); 
	}

}
