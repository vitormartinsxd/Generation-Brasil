package br.com.generation.exerciciojava02;

public class Exercicio01 {

	public static void main(String[] args) {

		for(int i = 1000; i <= 1999;i ++) {
			if(i % 11 == 5) {
				System.out.println("Numeros dividos por 11 com resto = 5 é:  " + i);
			}
			
		}
	}

}
