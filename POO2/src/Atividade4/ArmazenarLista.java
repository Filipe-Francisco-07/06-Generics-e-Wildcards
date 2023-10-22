package Atividade4;

import java.util.ArrayList;
import java.util.List;

public class ArmazenarLista <T>{
	private List<String> chaves = new ArrayList<>();
	private List<T> valores = new ArrayList<>();

	public boolean adicionarChaveValor(String chave, T valor) {
		if (!chaves.contains(chave)) {
			chaves.add(chave);
	        valores.add(valor);
	        return true;
	    }
	    return false;
	}

	public T buscarPorChave(String chave) {
	    int index = chaves.indexOf(chave);
	    if (index != -1) {
	        return valores.get(index);
	    }
	    return null;
	}
}
