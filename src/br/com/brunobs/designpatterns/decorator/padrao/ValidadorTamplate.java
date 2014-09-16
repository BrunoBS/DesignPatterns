package br.com.brunobs.designpatterns.decorator.padrao;

import java.util.HashMap;
import java.util.Map;

public abstract class ValidadorTamplate implements Validador {

	private Validador validador;
	private TipoValidacao tipoValidacao;
	private TipoCampo tipoCampo;

	public ValidadorTamplate(Validador validador) {
		this.validador = validador;
	}

	public ValidadorTamplate() {
	}

	@Override
	public final void valida(Filtro filtro) throws Exception {
		setTipoValidacao(TipoValidacao.fromDescricao(filtro.getValidador()));
		setTipoCampo(TipoCampo.fromDescricao(filtro.getTipo()));
		if (condicao(filtro)) {
			getValor(filtro);
			calculaOutraValidacao(filtro);
		}
	}

	protected final void calculaOutraValidacao(Filtro filtro) throws Exception {
		if (this.validador == null) {
			return;
		}
		this.validador.valida(filtro);

	}

	protected abstract void getValor(Filtro filtro) throws Exception;

	protected abstract boolean condicao(Filtro filtro);

	public TipoValidacao getTipoValidacao() {
		return this.tipoValidacao;
	}

	private void setTipoValidacao(TipoValidacao tipoValidacao) {
		this.tipoValidacao = tipoValidacao;
	}

	public TipoCampo getTipoCampo() {
		return this.tipoCampo;
	}

	private void setTipoCampo(TipoCampo tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

}

enum TipoValidacao {
	ULTIMO_DIA_UTIL("ULTIMO_DIA_UTIL"), ULTIMO_DIA_MES("ULTIMO_DIA_MES"), SOMENTE_NUMEROS("SOMENTE_NUMEROS");
	private String valor;

	private static final Map<String, TipoValidacao> valueMap = new HashMap<String, TipoValidacao>();

	static {
		for (TipoValidacao tipo : values()) {
			valueMap.put(tipo.getDescricao(), tipo);
		}
	}

	private TipoValidacao(String valor) {
		this.valor = valor;
	}

	public static TipoValidacao fromDescricao(String descricao) {
		return valueMap.get(descricao);
	}

	public String getDescricao() {
		return this.valor;
	}
}

enum TipoCampo {
	DATA("DATA"), INTEGER("INTEGER"), STRING("STRING");
	private String valor;

	private static final Map<String, TipoCampo> valueMap = new HashMap<String, TipoCampo>();

	static {
		for (TipoCampo tipo : values()) {
			valueMap.put(tipo.getDescricao(), tipo);
		}
	}

	private TipoCampo(String valor) {
		this.valor = valor;
	}

	public static TipoCampo fromDescricao(String descricao) {
		return valueMap.get(descricao);
	}

	public String getDescricao() {
		return this.valor;
	}
}