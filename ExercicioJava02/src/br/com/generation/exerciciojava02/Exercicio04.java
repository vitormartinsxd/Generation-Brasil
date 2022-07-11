package br.com.generation.exerciciojava02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int i =0, idade, sexo, mulheres = 0 , homens = 0 , outros = 0 , calmo = 0 , agressivo = 0 , nervoso = 0 , temperamento = 0 , nervosoMais = 0 , calmaMenos = 0 , totalCalmo;
		
		
		
		while(i <= 3) {
			System.out.println("Informa a sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("Digite 1 para sexo Feminino: " + "\nDigite 2 para sexo MasculinoS: " + "\nDigite 3 para Outros: ");
			sexo = entrada.nextInt();
			
		
			System.out.println("Digite 1 se considera uma pessoa calma:" + "\nDigite 2 se considera uma pessoa nervosa:" + "\nDigite 3 se considera uma pessoa agressiva:");
			temperamento = entrada.nextInt();
			
			
			
			if ( temperamento == 2 )
			{
				nervoso ++;
				if ( sexo == 1 )
				{
					mulheres ++;
				}
			}
			if ( temperamento == 3 )
			{
				agressivo ++;
				
				if ( sexo == 2 )
				{
					homens ++;
				}
			}
			
			if ( temperamento == 1 )	
			{
				calmo ++;
				
				if ( sexo == 3 )
				{
					outros ++;
				}
			}
			if ( idade >= 40 && temperamento == 2 )
			{
				
				nervosoMais ++;
			}
			if ( idade <= 18 && temperamento == 1 )
			{   
				calmaMenos ++;
			}
		
			i++;
		}
			System.out.println("O numero de pessoas calmas: " + calmo );
			System.out.println("O numero de mulheres nervosas: " + mulheres);
			System.out.println( "O numero de homens agressivos): " + homens);
			System.out.println("O numero de outros calmos: " + outros);
			System.out.println("O numero de pessoas nervosas com mais de 40 anos: " + nervosoMais);
			System.out.println("O numero de pessoas calmas com menos de 18 anos: " + calmaMenos);
			
			
			
			
		
	}

}
