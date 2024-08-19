package br.com.classes;


public class Cliente extends Pessoa{
		
	
@Override 
public void sacar (double valor) {
	
	var saldoDisponivel = getSaldo();
	var novoSaldo = saldoDisponivel - valor;
	setSaldo(novoSaldo);
}

@Override 
	public void depositar (double valor) {
	
	var saldoDisponivel = getSaldo();
	var novoSaldo = saldoDisponivel + valor * 0.10;
	setSaldo(novoSaldo);

	}
}	
	

	