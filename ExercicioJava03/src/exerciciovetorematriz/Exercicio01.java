package exerciciovetorematriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int [] pontAtividade = new int [5];
		int maiorPontuacao = 0;
		
		for(int i = 0; i < pontAtividade.length; i++) {
			System.out.println("Digite sua pontuação: ");
			pontAtividade[i] = entrada.nextInt();
			
			if (pontAtividade[i] > maiorPontuacao) {
				maiorPontuacao = pontAtividade[i];
			}
		}
		for(int i =0; i < pontAtividade.length; i ++) {
			System.out.println(pontAtividade[i] + " | ");
		}
		System.out.println("A maior pontuação é: " + maiorPontuacao);
		
	
		entrada.close();
	}

}
