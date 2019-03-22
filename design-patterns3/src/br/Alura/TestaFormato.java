package br.Alura;

public class TestaFormato {
	public static void main(String[] args) {
		
		Resposta r1 = new RespostaEmXml();
		Resposta r2 = new RespostaEmCsv();
		Resposta r3 = new RespostaEmPorcento();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		
		Conta conta1 = new Conta("Luzia", 10000.00);
		Conta conta2 = new Conta("Renan", 20000.00);
		
		Formato formato = null;
		
		Requisicao req1 = new Requisicao(formato.CSV);
		Requisicao req2 = new Requisicao(formato.PORCENTO);


		r1.responde(req1, conta1);
		r3.responde(req2, conta2);
	}
}
