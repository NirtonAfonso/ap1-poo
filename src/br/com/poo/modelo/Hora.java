/**
 * @author Nirton Afonso de Oliveira Filho
 * @matricula 201851301411
 *
 * @author Ilmar Macedo Alves Junior
 * @matricula 201851406603
 *
 * @docente Dr. Oberdan Rocha Pinheiro
 *
 */
package br.com.poo.modelo;

public class Hora {

    private int hora;
    private int minuto;

    /**
     * Construtor
     *
     * @param hora
     * @param minuto
     */
    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public int getHora() {
        return hora;
    }

    /**
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    /**
     * @param minuto
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        StringBuilder hora = new StringBuilder();
        hora.append("As ");
        hora.append(getHora());
        hora.append(":");
        hora.append(getMinuto());
        hora.append("H");
        return hora.toString();
    }

}
