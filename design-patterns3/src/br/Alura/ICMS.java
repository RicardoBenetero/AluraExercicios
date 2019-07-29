package br.Alura;

public class ICMS extends Imposto {
	
	
public ICMS (Imposto imposto) {
	
	super(imposto);
}

public ICMS () {
	
	
	super();
}
	

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento); 
	}

}
