package br.com.generation.exercicio02;

public class Aviao {

	public static void main(String[] args) {
		TestaAviao av = new TestaAviao();
		
		av.setHorario(	16);
		System.out.println(av.getHorario() + "Horas" );
		
		av.setDestino("Rio de Janeiro");
		System.out.println("Destino: " + av.getDestino());
		
		av.setChegada(18);
		System.out.println(av.getChegada() + "Horas" );
		
		nomeAviao("Gol", "Pernambuco");
		
	}
	
	public static void nomeAviao(String aviao, String destino) {
		System.out.println();
		System.out.println("	Rede: " + aviao);
		System.out.println("	Destino: " + destino);
	}
}
