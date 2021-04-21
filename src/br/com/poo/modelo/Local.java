package br.com.poo.modelo;

public class Local {
	private String endereco;
	private int CapacidadePessoas;
	
	public Local (String endereco, int capacidadePessoas) {
		setEndereco(endereco);
		setCapacidadePessoas(capacidadePessoas);
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCapacidadePessoas() {
		return CapacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		CapacidadePessoas = capacidadePessoas;
	}
	
	

}
