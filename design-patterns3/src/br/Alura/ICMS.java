package br.Alura;

public class ICMS implements Imposto {
	
	

	@Override
	public double calculaOrcamento(Orcamento orcamento) {
		return	(orcamento.getValor() * 0.05) + 50.00;
	}

}
