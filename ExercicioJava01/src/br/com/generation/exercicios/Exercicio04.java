package br.com.generation.exercicios;

import java.util.Scanner;
import java.math.*;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n;
		
		System.out.println("Digite o número: ");
		n = entrada.nextInt();
		
		if(n % 2 ==0){
			System.out.println("Par " + "\nA raiz quadrada desse numoero é: " + Math.sqrt(n));
		}else {
			System.out.println("Impar " + "\nEsse numero elavado a dois é: " + Math.pow(n, 2));
		}

		
	}

}
