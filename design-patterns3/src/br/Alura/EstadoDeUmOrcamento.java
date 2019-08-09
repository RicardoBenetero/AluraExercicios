package br.Alura;

public interface EstadoDeUmOrcamento {

	public void aplicadaDescontoExtra(Orcamento orcamento);

	public void aprova(Orcamento orcamento);

	public void reprova(Orcamento orcamento);

	public void finaliza(Orcamento orcamento) ;

}
