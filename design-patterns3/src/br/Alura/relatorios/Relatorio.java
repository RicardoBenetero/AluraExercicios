package br.Alura.relatorios;

import java.util.List;

import br.Alura.Conta;

public abstract class Relatorio {
	
	protected abstract void cabecalho();
	protected abstract void rodape();
	protected abstract void corpo(List<Conta> contas);

}
