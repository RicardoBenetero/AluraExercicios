package br.Alura;

public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicadaDescontoExtra(Orcamento orcamento) {
		 orcamento.valor -= orcamento.valor * 0.02;

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� em estado de aprova��o");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		 throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		 orcamento.estadoAtual = new Finalizado();

	}

}
