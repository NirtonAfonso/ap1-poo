package br.com.poo.modelo;

public class Local {
	private String endereco;
	private int CapacidadePessoas;

	public Local(String endereco, int capacidadePessoas) {
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

	@Override
	public String toString() {
		StringBuilder local = new StringBuilder();
		local.append("Local do evento: ");
		local.append(getEndereco());
		local.append("\n");
		local.append("Lotação Máxima: ");
		local.append(getCapacidadePessoas());
		local.append(" pessoas");

		return local.toString();
	}

}
