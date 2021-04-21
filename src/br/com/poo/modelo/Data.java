package br.com.poo.modelo;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if(dia>0 && dia<32) {
			this.dia = dia;
		} else System.out.println("Dia inválido");
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes>0 && mes<=12) {
			this.mes = mes;
		} else System.out.println("Mês Inválido"); 
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano > 0) {
			this.ano = ano;
		} else System.out.println("Ano Inválido");
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.getDia() + "/" + this.getMes() + "/" + this.getAno());
	}

}
