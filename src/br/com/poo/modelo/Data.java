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

public class Data {

    private int dia;
    private int mes;
    private int ano;

    /**
     * Construtor
     *
     * @param dia
     * @param mes
     * @param ano
     */
    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    /**
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    /**
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    /**
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        data.append(getDia());
        data.append("/");
        data.append(getMes());
        data.append("/");
        data.append(getAno());

        return data.toString();
    }

}
