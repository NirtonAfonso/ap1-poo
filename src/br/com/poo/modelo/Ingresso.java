package br.com.poo.modelo;

public class Ingresso {
	private double valor;
	private int contIngressos;
	
	public Ingresso (double valor, int contIngressos) {
		setValor(valor);
		setContIngressos(contIngressos);
	}
	
	public void setContIngressos(int contIngressos) {
		this.contIngressos = contIngressos;
	}
	// total de ingresso e igual a capacidade, a cada ingresso comprado menos um tera no estoque
	public void ingressoComprado(int quantidade) {
		contIngressos-= quantidade;
	}
	
	public int getContIngressos() {
		return contIngressos;
	}
	//metodo que retorna o valor do ingresso
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder ingresso = new StringBuilder();
		ingresso.append("R$ ");
		ingresso.append(getValor());
		ingresso.append("\t");
		ingresso.append("Quantidade a venda: ");
		ingresso.append(getContIngressos());
	
		return ingresso.toString();
	}
	
}