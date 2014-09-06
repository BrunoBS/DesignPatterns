package br.com.brunobs.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Dados implements Subject {
	private List<Observer> observadores;
	private float temperatura;
	private float humidade;
	private float pressao;

	public Dados() {
		this.observadores = new ArrayList<Observer>();
	}

	public void registrar(Observer o) {
		observadores.add(o);
	}

	public void remove(Observer o) {
		int i = observadores.indexOf(o);
		if (i >= 0) {
			observadores.remove(i);
		}

	}

	public void notifica() {
		for (Observer observer : observadores) {
			observer.atualiza(temperatura, humidade, pressao);
		}

	}

	public void mudancaDeMedicao() {
		notifica();
	}

	public void mudancaDeMedicao(float temperatura, float humidade, float pressao) {
		this.temperatura = temperatura;
		this.humidade = humidade;
		this.pressao = pressao;
		notifica();
	}

}
