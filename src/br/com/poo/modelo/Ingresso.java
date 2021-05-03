package br.com.poo.modelo;

public class Ingresso {

    private double valor;
    private int contIngressos;

    public Ingresso(double valor, int contIngressos) {
        setValor(valor);
        setContIngressos(contIngressos);
    }
    // total de ingresso e igual a capacidade, a cada ingresso comprado menos um tera no estoque

    public void ingressoComprado(int quantidade) {
        setContIngressos(contIngressos - quantidade);
    }

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

    public void setValor(double valor) {
        this.valor = valor;
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
        //ingresso.append("\t");
        //ingresso.append("Quantidade à venda: ");
        //ingresso.append(getContIngressos());

        return ingresso.toString();
    }

}
