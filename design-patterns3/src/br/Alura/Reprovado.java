package br.Alura;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicadaDescontoExtra(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de reprova��o, n�o pode aprovar agora!");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		 throw new RuntimeException("J� estou reprovado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}

}
