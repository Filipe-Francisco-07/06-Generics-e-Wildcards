package Atividade3;

public class ProdutoX {
	private int code;
	private String nome;
	private double valor;
	
	public ProdutoX() {
		
	}
	public ProdutoX(int code, String nome, double valor) {
		this.code = code;
		this.nome = nome;
		this.valor = valor;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "ProdutoX [code=" + code + ", nome=" + nome + ", valor=" + valor + ", getCode()=" + getCode()
				+ ", getNome()=" + getNome() + ", getValor()=" + getValor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
