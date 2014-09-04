package br.com.brunobs.designpatterns.decorator.filtro;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * O Padrão Decorator anexa responsabilidades acionais a um objeto
 * dinamicamaente. Os decoradores fornecem uma alternativa flexivel de subclasse
 * para estendera funcionalidade.
 * 
 * @author Bruno
 *
 */
public class TestaFiltro {
	public static void main(String[] args) {
		
		Conta c1 = new Conta("FiltroMenorQue100Reais", 99.99,  new GregorianCalendar(2008, 04, 4));
		Conta c2 = new Conta("FiltroMaiorQue500MilReais", 600000,  new GregorianCalendar(2008, 4, 04));
		Conta c3 = new Conta("FiltroMesmoMes", 112.30,  new GregorianCalendar(2014, 8, 10));
		Conta c4 = new Conta("Outra", 112.30,  new GregorianCalendar(2012, 8, 02));
		Conta c5 = new Conta("Outra dois", 221.30,  new GregorianCalendar(2012, 11, 10));
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		
		Filtro filtro =  new  FiltroMesmoMes();
		filtro = new FiltroMenorQue100Reais(filtro);
		filtro = new FiltroMaiorQue500MilReais(filtro);
		for (Conta conta: filtro.filtra(contas)) {
			System.out.println(conta.toString());
		}
	}

}
