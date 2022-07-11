package br.com.generation.exerciciojava02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, imp= 0,par = 0;
		
		for(int i=0; i <= 9; i++) {
			System.out.println("Informe um número: ");
			num = entrada.nextInt();
			
			if(num % 2 ==0 ) {
				num = par;
				par = par +1;
			} else {
				num = imp;
				imp = imp + 1;
			}
			
		}
		System.out.println("A quantidade de pares é: " + par);
		System.out.println("A quantidade de impares é: " + imp);
		
		
	}

}
