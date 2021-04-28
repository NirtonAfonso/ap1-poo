package br.com.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import br.com.poo.modelo.Data;
import br.com.poo.modelo.Evento;
import br.com.poo.modelo.Hora;
import br.com.poo.modelo.Local;

public class Appmain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Evento> listaEventos = new ArrayList<Evento>();
		double totalCompra = 0;
		int menu;
		int n;
		listaEventos.add(new Evento("Strogonoff do Nirton", new Data(8, 5, 2021), new Hora(12, 30), "Nirton",
				new Local("Casa de Niron", 6)));
		listaEventos.get(0).setIngresso(15);

		listaEventos.add(new Evento("Salvador fest", new Data(12, 8, 2022), new Hora(16, 00), "Igor kanario",
				new Local("Parque de exposicoes", 500)));
		listaEventos.get(1).setIngresso(45);

		listaEventos.add(new Evento("Culto online", new Data(25, 4, 2021), new Hora(19, 00), "Pastor ezequiel",
				new Local("Plataforma Zoom", 20)));
		listaEventos.get(2).setIngresso(2);
		do {
			Menu(listaEventos);
			System.out.println();
			System.out.println("Escolha o evento");
			menu = scan.nextInt();
			switch (menu) {

			case 1:
				System.out.println("Quantos ingressos deseja comprar?");
				n = scan.nextInt();
				totalCompra += listaEventos.get(0).ComprarIngresso(n);
				break;
			case 2:
				System.out.println("Quantos ingressos deseja comprar?");
				n = scan.nextInt();
				totalCompra += listaEventos.get(1).ComprarIngresso(n);
				break;
			case 3:
				System.out.println("Quantos ingressos deseja comprar?");
				n = scan.nextInt();
				totalCompra += listaEventos.get(2).ComprarIngresso(n);
				break;
			case 4:
				menu = 0;
				break;
			}
		} while (menu != 0);
		System.out.println("Valor total da compra " + totalCompra);

	}

	public static void Menu(List<Evento> listaEventos) {
		int i = 1;
		System.out.println("Lista de Eventos");
		for (Evento evento : listaEventos) {
			System.out.println(i + " - " + evento.toString() + "\n");
			i++;
		}
		System.out.println(i + " - Finalizar Compra");
	}
}
