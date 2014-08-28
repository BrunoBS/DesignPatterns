package br.com.brunobs.designpatterns.chain.dinheiro;

import java.math.BigDecimal;



/**
 * Padr�o de Projeto Chain of Responsibility. 
 * A ideia do padr�o � resolver problemas como esses: de acordo com o cen�rio, 
 * devemos realizar alguma a��o. Ao inv�s de escrevermos c�digo procedural, e 
 * deixarmos um �nico m�todo descobrir o que deve ser feito, quebramos essas 
 * responsabilidades em v�rias diferentes classes, e as unimos como uma corrente.
 *
 * @author Bruno
 * @Email bbsgt@hotmail.com
 * @Site wwww.brunobs.com.br
 *
 */
public class QuantidadeDeDinheiro {

	public static void main(String[] args) {
		saca(new BigDecimal(188.91));
	}

	public static void saca(BigDecimal valor) {
		Dinheiro notaCem = new NotaCem();
		Dinheiro notaCiquenta = new NotaCinquenta();
		Dinheiro notaVinte = new NotaVinte();
		Dinheiro notaDez = new NotaDez();
		Dinheiro notaCinco = new NotaCinco();
		Dinheiro notaDois = new NotaDois();
		Dinheiro moedaUm = new MoedaUm();
		Dinheiro moedaCinquenta = new MoedaCinquenta();
		Dinheiro moedaVienteECinco = new MoedaVinteECinco();
		Dinheiro moedaDez = new MoedaDez();
		Dinheiro moedaCinco = new MoedaCinco();
		Dinheiro moedaUmCentavo = new MoedaUmCentavo();
		Dinheiro notaZero = new NotaZero();

		notaCem.proximo(notaCiquenta);
		notaCiquenta.proximo(notaVinte);
		notaVinte.proximo(notaDez);
		notaDez.proximo(notaCinco);
		notaCinco.proximo(notaDois);
		notaDois.proximo(moedaUm);
		moedaUm.proximo(moedaCinquenta);
		moedaCinquenta.proximo(moedaVienteECinco);
		moedaVienteECinco.proximo(moedaDez);
		moedaDez.proximo(moedaCinco);
		moedaCinco.proximo(moedaUmCentavo);
		moedaUmCentavo.proximo(notaZero);

		notaCem.saca(valor);
	}

}
