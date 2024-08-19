package br.com.classes;

public class Diarista extends Pessoa{
	
	
	//metodos
	public void servico(String nomeCliente) {
		System.out.println("Esta realizando o atendimento para: " + nomeCliente);		
	
	}
	
	private String pix;

	public String getPix() {
		return pix;
	}

	public void setPix(String pix) {
		this.pix = pix;
	}
	@Override 
	public void sacar (double valor) {
		
		var saldoDisponivel = getSaldo();
		var novoSaldo = saldoDisponivel - valor;
		setSaldo(novoSaldo);
	}

	@Override 
		public void depositar (double valor) {
		
		var saldoDisponivel = getSaldo();
		var novoSaldo = saldoDisponivel + valor;
		setSaldo(novoSaldo);

		}

	}



