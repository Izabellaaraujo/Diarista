package br.com.classes;

public class Atendimento {
	
	private int horas;
	
	//Criando metodo acessor Set, nesse metodo posso passar minhas regras de negocio
	public void setHoras(int horas) {
		
		if (horas < 1  || horas > 12) {
			
		System.out.println("A quantiade de horas de um atendimento não pode ser menor que 1 e nem maior que 12 horas");
		
		}
			
		else {
			this.horas=horas;	
			
			
		}
	
	}
// O metodo get não usa Void pois uso somente para "PEGAR" uma informação
	
	  public int getHoras() {
		  return horas; 
	  }
	  
	

}
