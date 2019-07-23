package br.Alura;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public double calculaOrcamento(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {

			return minimaTaxacao(orcamento);

		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
