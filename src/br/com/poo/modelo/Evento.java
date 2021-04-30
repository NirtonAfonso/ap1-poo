package br.com.poo.modelo;

import br.com.poo.modelo.Data;
import br.com.poo.modelo.Hora;
import br.com.poo.modelo.Local;
import br.com.poo.modelo.Ingresso;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private String nome;
    private Data data;
    private Hora hora;
    private Local local;
    private String artista;
    private Ingresso ingresso;

    // construtor
    public Evento(String nome, Data data, Hora hora, String artista, Local local) {
        setNome(nome);
        setData(data);
        setHora(hora);
        setArtista(artista);
        setLocal(local);
    }

    // metodo que testa a quantidade de ingressos com a capacidade para saber se
    // ainda tem lugar disponivel
    public double ComprarIngresso(int n) {
        if (ingresso.getContIngressos() > 0) {
            ingresso.ingressoComprado(n);
            System.out.println("Ingresso Comprado!");
            return ingresso.getValor() * n; // "n" e o numero de ingressos que o cliente quer, o metodo retorna o valor

        } else {
            System.out.println("evento " + nome + " lotado");
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

    @Override
    public String toString() {
        StringBuilder evento = new StringBuilder();
        evento.append(getNome());
        evento.append("\n\t");
        evento.append(getArtista());
        evento.append("\n");
        evento.append(getData());
        evento.append("\n\t");
        evento.append(getHora());
        evento.append("\n");
        evento.append(getLocal());
        evento.append("\n");
        evento.append(getIngresso());

        return evento.toString();
    }

}
