package br.com.generation.exerciciojava02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);


		int soma =0, num = 0, i=0;
		
		
		do {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
			if(num != 0) {
				soma += num;
			} 
			if(num == 0) {
				System.out.println("Numero igual a zero: \nFim de programa...");
				break;
			}
			
			i++;

		}while(i <= 3);
		
		System.out.println("A soma dos numeros é: " + soma);
		
		entrada.close();
	}

}
