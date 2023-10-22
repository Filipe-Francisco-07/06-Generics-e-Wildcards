package Atividade3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<ProdutoX> lista = new ArrayList<>();
	
	
	public void mostrarLista() {
		for(ProdutoX p : lista) {
			System.out.println("Código: " + p.getCode() + ", Nome: " + p.getNome()+", Valor: "+p.getValor());
		}
	}
	
	public void adicionarProdutos(ProdutoX produto) {
		lista.add(produto);
	}
	
}
