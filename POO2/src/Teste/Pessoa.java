package Teste;

public class Pessoa {
	private int idade;

	public Pessoa(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double salario(int n1 ,int n2) {
		return n1*n2;
	}
	
}
