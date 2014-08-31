package br.com.brunobs.designpatterns.chain.contabancaria;

public class RespostaEmXML implements Resposta {
	private Resposta resposta;

	public RespostaEmXML(Resposta resposta) {
		super();
		this.resposta = resposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.XML.equals(req.getFormato())) {
			StringBuilder xml = new StringBuilder();
			xml.append("<conta>\n");
			xml.append("\t<titular>" + conta.getTitular() + "</titular>\n");
			xml.append("\t<saldo>" + conta.getTitular() + "</saldo>\n");
			xml.append("</conta>\n");
			System.out.println(xml.toString());

		} else {
			if (resposta != null) {
				resposta.responde(req, conta);
			}
		}
	}

}
