package br.com.poo.modelo;

public class Hora {
	private int hora;
	private int minuto;

	public Hora(int hora, int minuto) {
		setHora(hora);
		setMinuto(minuto);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		StringBuilder hora = new StringBuilder();
		hora.append("Às ");
		hora.append(getHora());
		hora.append(":");
		hora.append(getMinuto());
		hora.append("H");
		return hora.toString();
	}

}
