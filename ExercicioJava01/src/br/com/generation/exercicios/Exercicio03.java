package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <= 14){
			System.out.println("Infantil");
		} if(idade >= 15 && idade <=17) {
			System.out.println("Juvenil");
		}
		if  (idade >= 18 && idade <= 25){
			System.out.println("Adulto");
		} else {
			System.out.println("Idade não atribuida ao parametro pedido!!");
		}
		
		
		
		
		
	}

}
