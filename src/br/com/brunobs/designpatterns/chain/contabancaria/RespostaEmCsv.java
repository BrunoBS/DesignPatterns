package br.com.brunobs.designpatterns.chain.contabancaria;

public class RespostaEmCsv implements Resposta {
	private Resposta resposta;

	
	public RespostaEmCsv(Resposta resposta) {
		super();
		this.resposta = resposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + ";" + conta.getSaldo());
		} else {
			if (resposta != null) {
				resposta.responde(req, conta);
			}
		}
	}

	
}
