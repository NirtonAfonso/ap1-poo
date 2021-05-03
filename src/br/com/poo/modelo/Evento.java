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
    JFrame frame = new JFrame();

    // construtor
    public Evento(String nome, Data data, Hora hora, String artista, Local local) {
        setNome(nome);
        setData(data);
        setHora(hora);
        setArtista(artista);
        setLocal(local);
    }
    
    public Evento (String nome, Ingresso ingresso){
        setNome(nome);
    }

    // metodo que testa a quantidade de ingressos com a capacidade para saber se
    // ainda tem lugar disponivel
    public double ComprarIngresso(int n) {
        if (ingresso.getContIngressos() > 0) {
            if (n <= ingresso.getContIngressos()) {
                ingresso.ingressoComprado(n);
                JOptionPane.showMessageDialog(frame, "Ingresso Comprado!", "Confirm", JOptionPane.INFORMATION_MESSAGE);
                //System.out.println("Ingresso Comprado!");
                return ingresso.getValor() * n; // "n" e o numero de ingressos que o cliente quer, o metodo retorna o valor
            } else {
                JOptionPane.showMessageDialog(frame, "Quantidade de ingressos solicitados maior so que a disponivel em estoque!", "Erro", JOptionPane.ERROR_MESSAGE);
               // System.out.println("Quantidade de ingressos solicitados maior so que a disponivel em estoque!");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "evento " + nome + " lotado", "Erro", JOptionPane.WARNING_MESSAGE);
            //System.out.println("evento " + nome + " lotado");
        }
        return 0;
    }

    /* ArrayList<Evento> listaEventos = new ArrayList<Evento>();

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setLista(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }*/
    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }
    //o ingresso recebe o valor e a capacidade, a quantidade de ingressos ser� de acordo � capacidade do evento.

    public void setIngresso(double valor) {
        ingresso = new Ingresso(valor, local.getCapacidadePessoas());
    }
    
    public void setQuantidadeIngresso(double valor, int quantIngresso){
        ingresso = new Ingresso(valor, quantIngresso);
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
