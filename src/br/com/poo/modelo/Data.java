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
        // if (dia > 0 && dia < 32) {
        this.dia = dia;
        // } else {
        //   System.out.println("Dia invalido");
        // }
    }

    public int getMes() {
        return mes;
    }

    /**
     * @param mes
     */
    public void setMes(int mes) {
        //if (mes > 0 && mes <= 12) {
        this.mes = mes;
        //  } else {
        //     System.out.println("Mes Invalido");
        // }
    }

    public int getAno() {
        return ano;
    }

    /**
     * @param ano
     */
    public void setAno(int ano) {
        //if (ano > 0) {
        this.ano = ano;
        // } else {
        //   System.out.println("Ano Invalido");
        // }
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
