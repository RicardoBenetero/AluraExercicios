package br.Alura;

public class CalculadorDeImposto {
	
	
	
	public void realizacalculo(Orcamento orcamento, Imposto imposto) {
		
		double impostoCalculado = imposto.calculaOrcamento(orcamento);
		
		System.out.println(impostoCalculado);
	}

}
