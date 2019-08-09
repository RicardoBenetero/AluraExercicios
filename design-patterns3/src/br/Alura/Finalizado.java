package br.Alura;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicadaDescontoExtra(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Não posso mudar mais, já estou finalizado!");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		 throw new RuntimeException("Não posso mudar mais, já estou finalizado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		 throw new RuntimeException("Não posso mudar mais, já estou finalizado!");

	}

}
