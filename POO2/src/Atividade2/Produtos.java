package Atividade2;

import java.util.Date;

public class Produtos <T> {
	private T id;
	private double valor;
	private Date dataFabric;
	private Date dataVenc;
	
	public Produtos() {
		
	}
	
	public Produtos(T id, double valor, Date dataFabric, Date dataVenc) {
		this.id = id;
		this.valor = valor;
		this.dataFabric = dataFabric;
		this.dataVenc = dataVenc;
	}
	
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getDataFabric() {
		return dataFabric;
	}
	public void setDataFabric(Date dataFabric) {
		this.dataFabric = dataFabric;
	}
	public Date getDataVenc() {
		return dataVenc;
	}
	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	@Override
	public String toString() {
		return "Produtos [id=" + id + ", valor=" + valor + ", dataFabric=" + dataFabric + ", dataVenc=" + dataVenc
				+ ", getId()=" + getId() + ", getValor()=" + getValor() + ", getDataFabric()=" + getDataFabric()
				+ ", getDataVenc()=" + getDataVenc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
