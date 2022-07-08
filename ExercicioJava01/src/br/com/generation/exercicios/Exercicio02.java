package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int n1 , n2 , n3, result;
		  
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o priemiro numero: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = entrada.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = entrada.nextInt();

		
		
		  	if(n2 < n1){
		  		result = n1;
		  		n1 = n2;
		  		n2 = result;
			}
			  
		  	if(n3 < n1){
		  		result = n1;
		  		n1 = n3;
		  		n3 = result;
			}
			  
		  	if(n3 < n2){
		  		result = n2;
		  		n2 = n3;
		  		n3 = result;
			}
			  
			  System.out.println("Os numeros em ordem crescente é: " +  n1 + ", " +  n2 +  ", " +  n3);
			  
			  entrada.close();
	}

}
