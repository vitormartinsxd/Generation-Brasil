package br.com.generation.exerciciojava02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, soma = 0, cont = 0;
		double mediaMultiplos =0;
		

		do {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
			if((num % 3 ==0)&&(num != 0)) {
				cont += 1;
				soma = soma +num;
				
				
			} 
			if(num == 0) {
				System.out.println("Fim de programa...");
				break;
			}
			
			
			

		}while(num != 0);
		
		
		mediaMultiplos = soma/cont;
		System.out.println("A media dos multiplos por 3 é: " + mediaMultiplos);
	}

}
