package br.com.brunobs.designpatterns.decorator.padrao;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ValidaUltimoDiaDoMes extends ValidadorTamplate {

	private Calendar cal = Calendar.getInstance();
	private SimpleDateFormat dataAmericana = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat dataBrasil = new SimpleDateFormat("dd/MM/yyyy");

	public ValidaUltimoDiaDoMes(Validador validador) {
		super(validador);
	}

	public ValidaUltimoDiaDoMes() {
		super();
	}

	@Override
	public void getValor(Filtro filtro) throws Exception {
		this.cal.setTime(this.dataBrasil.parse(filtro.getValor()));
		this.cal.set(Calendar.DAY_OF_MONTH, this.cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		filtro.setValor(this.dataAmericana.format(this.cal.getTime()));

	}

	@Override
	protected boolean condicao(Filtro filtro) {
		return getTipoValidacao().equals(TipoValidacao.ULTIMO_DIA_MES) && getTipoCampo().equals(TipoCampo.DATA);
	}

}