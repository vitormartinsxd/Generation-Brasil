package br.com.generation.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {

		int n1 = 5, n2 = 8, n3 = 2;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é N1: " + n1);
		} if(n2 > n1 && n2 > n3) {
			System.out.println("O maior número é B: " + n2);
		} else {
			System.out.println("O maior número é C:" + n3);
		}
	}

}
