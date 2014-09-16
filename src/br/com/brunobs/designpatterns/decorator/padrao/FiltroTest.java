package br.com.brunobs.designpatterns.decorator.padrao;

import java.util.ArrayList;

import org.junit.Test;

public class FiltroTest {

	@Test
	public void validaUltimaDataBase() {
	}

	@Test
	public void validaPesquisaRelatorioX() throws Exception {
		ArrayList<Filtro> list = new ArrayList<Filtro>();
		Filtro filtro = new Filtro();
		filtro.setNome("Cooperativa");
		filtro.setTipo("INTEGER");
		filtro.setValidador("SOMENTE_NUMEROS");
		filtro.setValor("4340");

		list.add(filtro);

		filtro = new Filtro();
		filtro.setNome("Data/Mês");
		filtro.setTipo("DATA");
		filtro.setValidador("ULTIMO_DIA_MES");
		filtro.setValor("01/02/2014");
		list.add(filtro);

		for (Filtro f1 : list) {
			Validador validador = new ValidaValorInteiro();
			validador = new ValidaUltimoDiaDoMes(validador);
			validador = new ValidaUltimoDiaUtilDoMes(validador);
			validador = new ValidaUltimaDataBase(validador);
			validador.valida(f1);
			System.out.println(f1.getNome() + ": " + f1.getValor());

		}
	}
}
