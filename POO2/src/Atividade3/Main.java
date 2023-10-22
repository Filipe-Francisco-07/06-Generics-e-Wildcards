package Atividade3;

public class Main {

	public static void main(String[] args) {

		ProdutoX p1 = new ProdutoX(1, "Pastel", 5.50);
		ProdutoX p2 = new ProdutoX(2, "Coca-Cola 600ml", 6.00);
		ProdutoX p3 = new ProdutoX(3, "Coxinha", 5.50);
		
		Pedido pedido = new Pedido();
		
		pedido.adicionarProdutos(p1);
		pedido.adicionarProdutos(p2);
		pedido.adicionarProdutos(p3);
		
		pedido.mostrarLista();

	}

}
