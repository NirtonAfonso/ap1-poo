package br.com.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.poo.modelo.Data;
import br.com.poo.modelo.Evento;
import br.com.poo.modelo.Hora;
import br.com.poo.modelo.Local;

public class Appmain {

	public static void main(String[] args) {
		List<Evento> listaEventos = new ArrayList <Evento>();
		
		listaEventos.add(new Evento("Strogonoff do Nirton",
				new Data(8, 5, 2021),
				new Hora(12, 30),
				"Nirton",
				new Local ("Casa de Niron", 6)));
		
		listaEventos.add(new Evento("Salvador fest",
							new Data(12, 8, 2022),
							new Hora(16, 00),
							"Igor kan�rio",
							new Local ("Parque de exposições", 500)));
		
		listaEventos.add(new Evento("Culto online",
				new Data(25, 4, 2021),
				new Hora(19, 00),
				"Pastor ezequiel",
				new Local ("Plataforma Zoom", 20)));
		
		for(Evento evento : listaEventos) {
			System.out.println(evento.toString() + "\n");
		}
			
	}
	
	
}
