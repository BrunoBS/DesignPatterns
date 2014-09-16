package br.com.brunobs.designpatterns.decorator.padrao;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ValidaUltimaDataBase extends ValidadorTamplate {
	private Calendar cal = Calendar.getInstance();
	private SimpleDateFormat formatData = new SimpleDateFormat("yyyy-MM-dd");

	public ValidaUltimaDataBase(Validador validador) {
		super(validador);
	}

	public ValidaUltimaDataBase() {
		super();
	}

	@Override
	public void getValor(Filtro filtro) throws Exception {
		this.cal.setTime(this.formatData.parse(filtro.getValor()));
		// TODO:PEGA A ULTIMA DATA BASE DO SISTEMA.
	}

	@Override
	protected boolean condicao(Filtro filtro) {
		return getTipoCampo().equals(TipoCampo.DATA);
	}
}