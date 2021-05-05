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

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Evento {

    private String nome;
    private Data data;
    private Hora hora;
    private Local local;
    private String artista;
    private Ingresso ingresso;
    private int quantComprado = 0;
    JFrame frame = new JFrame();

    /**
     * Construtor
     *
     * @param nome
     * @param data
     * @param hora
     * @param artista
     * @param local
     */
    public Evento(String nome, Data data, Hora hora, String artista, Local local) {
        setNome(nome);
        setData(data);
        setHora(hora);
        setArtista(artista);
        setLocal(local);
    }

    public Evento() {
    }

    /**
     * metodo que testa a quantidade de ingressos com a capacidade para saber se
     * ainda tem lugar disponivel
     *
     * @param n
     * @return
     */
    public double ComprarIngresso(int n) {
        if (ingresso.getContIngressos() > 0) {
            if (n <= ingresso.getContIngressos()) {
                ingresso.ingressoComprado(n);
                JOptionPane.showMessageDialog(frame, "Ingresso Comprado!", "Confirm", JOptionPane.INFORMATION_MESSAGE);
                setQuantComprado(n);
                return ingresso.getValor() * n; // "n" e o numero de ingressos que o cliente quer, o metodo retorna o valor
            } else {
                JOptionPane.showMessageDialog(frame, "Quantidade de ingressos solicitados maior so que a disponivel em estoque!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "evento " + nome + " lotado", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    public Hora getHora() {
        return hora;
    }

    /**
     * @param hora
     */
    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    public Local getLocal() {
        return local;
    }

    /**
     * @param local
     */
    public void setLocal(Local local) {
        this.local = local;
    }

    public String getArtista() {
        return artista;
    }

    /**
     * @param artista
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    /**
     * o ingresso recebe o valor e a capacidade, a quantidade de ingressos sera
     * de acordo a capacidade do evento
     *
     * @param valor
     */
    public void setIngresso(double valor) {
        ingresso = new Ingresso(valor, local.getCapacidadePessoas(), getQuantComprado());
    }

    public int getQuantComprado() {
        return quantComprado;
    }

    /**
     * @param quantComprado
     */
    public void setQuantComprado(int quantComprado) {
        this.quantComprado = quantComprado;
    }

    @Override
    public String toString() {
        StringBuilder evento = new StringBuilder();
        evento.append("Atracao: ");
        evento.append(getArtista());
        evento.append("\n\n");
        evento.append("DATA: ");
        evento.append(getData());
        evento.append("\n\n");
        evento.append("Horario: ");
        evento.append(getHora());
        evento.append("\n\n");
        evento.append(getLocal());
        evento.append("\n\n");
        evento.append(getIngresso());

        return evento.toString();
    }

}
