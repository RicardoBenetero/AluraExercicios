package br.Alura;

public class ISS implements Imposto {

	@Override
	public double calculaOrcamento(Orcamento orcamento) {
		return	orcamento.getValor() * 0.06;

	}

}
