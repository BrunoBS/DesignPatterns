package br.com.brunobs.designpatterns.observer;

public class Teste {
	public static void main(String[] args) {
		Dados dados = new Dados();
		DisplayElement condicaoDisplay = new CondicaoDisplay(dados);
		dados.mudancaDeMedicao(80, 65,  30.4f);
		dados.mudancaDeMedicao(82, 70,  30.4f);
		dados.mudancaDeMedicao(78, 90,  30.4f);
		
	}	
}
