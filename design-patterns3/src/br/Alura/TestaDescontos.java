package br.Alura;

public class TestaDescontos {
	
	 public static void main(String[] args) {
		 
		 CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		 
		 Orcamento orcamento = new Orcamento(600.0);
		 
		 orcamento.adicionaItem(new Item("CANETA", 300.0));
		 orcamento.adicionaItem(new Item("LAPIS", 300.0));
		 
		 double desconto = calculador.calcula(orcamento);
		 
		 System.out.println(desconto);
 
	 }

}
