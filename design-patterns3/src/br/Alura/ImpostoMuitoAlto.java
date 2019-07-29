package br.Alura;

public class ImpostoMuitoAlto extends Imposto {
	
	public ImpostoMuitoAlto(Imposto Imposto) {
		
		super(Imposto);
	}
	
public ImpostoMuitoAlto() {
		
		super();
	}

@Override
public double calcula(Orcamento orcamento) {
	return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento); 
}
	
	
	

}
