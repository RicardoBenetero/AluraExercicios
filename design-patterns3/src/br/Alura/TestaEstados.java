package br.Alura;

public class TestaEstados {

	public static void main(String[] args) {
		
		
		Orcamento reforma = new Orcamento(500.00);
		
		
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		 reforma.aplicaDescontoExtra();
		 
		 System.out.println(reforma.getValor());
		 
		 reforma.finaliza();
		 
		 reforma.finaliza();


	}

}
