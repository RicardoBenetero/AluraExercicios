package br.Alura;

public class Conta {
	
	private double saldo;
	private String titular;
	private String nome;
	
	
	public Conta(String titular, double saldo) {
		
		this.saldo = saldo;
		this.titular = titular;
		
	}
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public String getNome() {
		return nome;
	}
	public String getNumero() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getAgencia() {
		// TODO Auto-generated method stub
		return null;
	}

}
