package br.com.brunobs.designpatterns.decorator.padrao;

public class ValidaUltimoDiaUtilDoMes extends ValidadorTamplate {

	public ValidaUltimoDiaUtilDoMes(Validador validador) {
		super(validador);
	}

	public ValidaUltimoDiaUtilDoMes() {
	}

	@Override
	protected boolean condicao(Filtro filtro) {
		return getTipoValidacao().equals(TipoValidacao.ULTIMO_DIA_UTIL) && getTipoCampo().equals(TipoCampo.DATA);
	}

	@Override
	protected void getValor(Filtro filtro) throws Exception {
		// TODO Auto-generated method stub

	}

}