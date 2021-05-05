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

public class Ingresso {

    private double valor;
    private int contIngressos;
    private int capacidadeMax;

    /**
     * Variavel auxiliar para contabilizar a quantidade de ingressos vendidos
     */
    private int aux = 0;

    /**
     * Construtor
     *
     * @param valor
     * @param contIngressos
     * @param quantVendidos
     */
    public Ingresso(double valor, int contIngressos, int quantVendidos) {
        setValor(valor);
        setContIngressos(contIngressos);
        setCapacidadeMax(contIngressos);
    }

    /**
     * total de ingresso e igual a capacidade, a cada ingresso comprado menos um
     * tera no estoque
     *
     * @param quantidade
     */
    public void ingressoComprado(int quantidade) {
        setContIngressos(contIngressos - quantidade);
        setAux(quantidade);
    }

    /**
     *
     * @param contIngressos
     */
    public void setContIngressos(int contIngressos) {
        this.contIngressos = contIngressos;
    }

    public int getContIngressos() {
        return contIngressos;
    }
    //metodo que retorna o valor do ingresso

    public double getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    /**
     *
     * @param capacidadeMax
     */
    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public int getAux() {
        return aux;
    }

    /**
     *
     * @param aux
     */
    public void setAux(int aux) {
        this.aux = getAux() + aux;
    }

    @Override
    public String toString() {
        StringBuilder ingresso = new StringBuilder();
        ingresso.append("Valor do ingresso: ");
        ingresso.append("R$ ");
        ingresso.append(getValor());
        ingresso.append("\n\n");
        ingresso.append("Quantidade a venda: ");
        ingresso.append(getContIngressos());

        return ingresso.toString();
    }

}
