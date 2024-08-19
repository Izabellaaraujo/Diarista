package br.com.app;

import br.com.classes.Cliente;

import br.com.classes.Diarista;

import br.com.classes.Atendimento;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//Instanciando objeto a partir da classe diarista
		Diarista diarista  = new Diarista();
		Cliente cliente = new Cliente();
		Scanner input = new Scanner(System.in);
		Atendimento atendimento = new Atendimento();
				
				
		///Classe cliente
		System.out.println("Digite o nome da Cliente: ");
		cliente.setNome(input.nextLine());
		System.out.println("Digite o telefone da Cliente: ");
		cliente.setTelefone(input.nextLine());
		System.out.println("Digite o endereço da Cliente: ");
		cliente.setEndereco(input.nextLine());
		//cliente.setSaldo(100.30);
		System.out.println("Digite o saldo do cliente: ");
		cliente.depositar(input.nextDouble());
		input.nextLine();
		
		System.out.println("***********************************\n ");
		
		//Classe diarista
		
		System.out.println("Digite o nome da Diarista: ");
		diarista.setNome(input.nextLine());
		System.out.println("Digite o telefone da Diarista: ");
		diarista.setTelefone(input.nextLine());;
		System.out.println("Digite o endereço da Diarista: ");
		diarista.setEndereco(input.nextLine());
		System.out.println("Digite o pix da Diarista: ");
		diarista.setPix(input.nextLine());
		System.out.println("Digite quant de horas trabalhadas: ");
		atendimento.setHoras(input.nextInt());
		System.out.println("Digite o saldo da diarista: ");
		diarista.sacar(input.nextDouble());
		input.nextLine();
		
		System.out.println(atendimento.getHoras());
		
		System.out.println("***********************************\n ");
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Telefone: " + cliente.getNome());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Saldo: " + cliente.getSaldo());
		System.out.println("Saldo do cliente: " + cliente.getSaldo());

				
		System.out.println("***********************************\n ");

		System.out.println("Nome: " + diarista.getNome());
		System.out.println("Telefone: " + diarista.getTelefone());
		System.out.println("Endereço: " + diarista.getEndereco());
		System.out.println("Chave pix: " + diarista.getPix());
		System.out.println("Saldo da diarista: " + diarista.getSaldo());
		System.out.println("Quantidade de horas trabalhadas: " + atendimento.getHoras());
		diarista.servico("Anne");
		

		
	}

}
