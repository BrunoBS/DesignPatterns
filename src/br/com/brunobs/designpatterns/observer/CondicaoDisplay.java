package br.com.brunobs.designpatterns.observer;

public class CondicaoDisplay implements Observer, DisplayElement {
	private float temperatura;
	private float humidade;
	private float pressao;
	private Subject subject;

	public CondicaoDisplay(Subject subject) {
		this.subject = subject;
		subject.registrar(this);

	}

	public void atualiza(float temperatura, float humidade, float pressao) {
		this.temperatura = temperatura;
		this.humidade = humidade;
		this.pressao = pressao;
		display();

	}

	@Override
	public void display() {
		System.out.printf("Temperatura: %.2f ºC Humidade: %.2f %% \n", temperatura, humidade);

	}

}
