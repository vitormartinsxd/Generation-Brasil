package exerciciovetorematriz;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int [][] vetorUsuario = new int[3][3];
		int soma = 0, somaDiagonal =0, maiorNumero =0, menorNumero = 1000;

			for( int l = 0; l < vetorUsuario.length; l++){
				for (int c =0; c < vetorUsuario.length; c++){
					System.out.println("Numero: ");
					vetorUsuario [l][c] = entrada.nextInt();
				
					soma += vetorUsuario[l][c];
					
			if (vetorUsuario[l][c] > maiorNumero){
						maiorNumero = vetorUsuario[l][c];
					}
			if(vetorUsuario[l][c] < menorNumero){

						menorNumero = vetorUsuario[l][c];
				}
					}
				}
				
			somaDiagonal = vetorUsuario[0][0] + vetorUsuario[1][1] + vetorUsuario [2][2];
			
			for( int l = 0; l < vetorUsuario.length; l++){
					for (int c =0; c < vetorUsuario.length ; c++){
					System.out.print(vetorUsuario[l][c] + " | ");
						
					}
					System.out.println();
				}
			System.out.println("\nA soma é total da Matriz: " + soma);
			System.out.println("\nA soma da Diagonal da Matriz: " + somaDiagonal);
			System.out.println("\nO maior numero da Matriz é: " + maiorNumero);
			System.out.println("\nO menor numero da Matriz é: " + menorNumero);
			
		
		
	}

}
