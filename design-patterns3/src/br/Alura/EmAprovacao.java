package br.Alura;

public class EmAprovacao implements EstadoDeUmOrcamento {

	@Override
	public void aplicadaDescontoExtra(Orcamento orcamento) {
		 orcamento.valor -= orcamento.valor * 0.05;
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		  throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
    }
		
	}


