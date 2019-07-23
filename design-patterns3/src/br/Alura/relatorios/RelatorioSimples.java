package br.Alura.relatorios;

import java.util.List;

import br.Alura.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		
	}

	@Override
	protected void rodape() {
		System.out.println("(11)5896-1235");
		
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta conta : contas) {
			
			
			
			System.out.println( conta.getNome() + " - " + conta.getSaldo() );
		}
		
	}

}
