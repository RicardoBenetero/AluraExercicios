package br.Alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
        this.valor = valor;
		this.estadoAtual = new EmAprovacao();

	}

	public void aplicaDescontoExtra() {

		estadoAtual.aplicadaDescontoExtra(this);

	}

	public void aprova() {

		estadoAtual.aprova(this);
	}

	public void reprova() {

		estadoAtual.reprova(this);
	}
	
	public void finaliza() {

		estadoAtual.finaliza(this);
	}

	public double getValor() {
		return valor;
	}

}
