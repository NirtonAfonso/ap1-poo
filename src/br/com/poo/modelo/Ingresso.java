package br.com.poo.modelo;

public class Ingresso {
	private double valor;
	private int contIngressos = 0;
	
	public void ingressoComprado() {
		contIngressos++;
	}
	
	public int getContIngressos() {
		return contIngressos;
	}
	//metodo que retorna o valor do ingresso
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder ingresso = new StringBuilder();
		ingresso.append("R$ ");
		ingresso.append(getValor());
		ingresso.append("\t");
		ingresso.append("Quantidade á venda: ");
		ingresso.append(getContIngressos());
	
		return ingresso.toString();
	}
	
}