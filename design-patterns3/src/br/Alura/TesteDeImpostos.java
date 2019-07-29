package br.Alura;

public class TesteDeImpostos {
	public static void main(String[] args) {
	//	Imposto impostos = new ISS(new ICMS());
		
	//	Orcamento orcamento = new Orcamento(500.0);
		
	//	System.out.println(impostos.calcula(orcamento));
		
		
		Imposto impostos = new ImpostoMuitoAlto(new ICMS());
		
		//Imposto impostos = new ImpostoMuitoAlto();

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
		
	}

}
