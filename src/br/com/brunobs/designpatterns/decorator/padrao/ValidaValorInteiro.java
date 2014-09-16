package br.com.brunobs.designpatterns.decorator.padrao;

public class ValidaValorInteiro extends ValidadorTamplate {

	public ValidaValorInteiro(Validador validador) {
		super(validador);
	}

	public ValidaValorInteiro() {
		super();
	}

	@Override
	public void getValor(Filtro filtro) throws Exception {
		if (!filtro.getValor().matches("\\d*")) {
			throw new IllegalArgumentException("Valor inválido para o campo " + filtro.getNome());
		}
	}

	@Override
	protected boolean condicao(Filtro filtro) {
		return getTipoCampo().equals(TipoCampo.INTEGER) && getTipoValidacao().equals(TipoValidacao.SOMENTE_NUMEROS);

	}
}
