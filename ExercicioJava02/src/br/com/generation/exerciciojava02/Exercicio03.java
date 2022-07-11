package br.com.generation.exerciciojava02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int i =0, idade, idMenor = 0, idMaior = 0;
		Scanner entrada = new Scanner(System.in);
		
		while (i <= 3) {
			System.out.println("Digite a sua idade: ");
			idade = entrada.nextInt();
			
			if(idade >= 0 && idade < 21) {
				idade = idMenor;
				idMenor = idMenor +1;
				
			} 
			if (idade > 50 ) {
				idade = idMaior;
				idMaior = idMaior + 1;
				
			} else if (idade == -99){
				System.out.println("Fim do programa...");
				break;
				
			}	
			i++;
			
		}
		
		System.out.println("A quantidade de pessoas com menos de 21 anos é: " + idMenor);
		System.out.println("A quantidade de pessoas com mais de 50 anos é: " + idMaior);
		
	}

}
