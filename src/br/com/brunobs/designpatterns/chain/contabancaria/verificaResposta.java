package br.com.brunobs.designpatterns.chain.contabancaria;

public class verificaResposta {


	public void responde(Formato formato){
		Resposta percentual = new RespostaEmPorcento(null);
		Resposta csv = new RespostaEmCsv(percentual);
		Resposta xml = new RespostaEmXML(csv);
		Requisicao req = new Requisicao(formato);
		Conta conta= new Conta("Bruno Barbosa", 150);
		xml.responde(req, conta);
		
	}
}
