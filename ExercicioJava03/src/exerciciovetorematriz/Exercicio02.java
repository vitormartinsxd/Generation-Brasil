package exerciciovetorematriz;

import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int [] vetorDado = new int[10];
		int  qtdMaiorNum = 0, atualMaiorNum =0;
		double media = 0.0, soma = 0;
				
				for(int i = 0; i < vetorDado.length; i++){
				
				System.out.println("Digite a posição que seu dado caiu, de 1 a 6: " );
				vetorDado[i] = entrada.nextInt();

				if(vetorDado[i] > atualMaiorNum){
					qtdMaiorNum = 1;
					atualMaiorNum = vetorDado[i];	
				}
				else if(vetorDado[i] == atualMaiorNum){
					qtdMaiorNum++;
				}
					
			}
				for(int i = 0; i < vetorDado.length; i++){
					soma += vetorDado[i];
					media = soma/vetorDado.length;

				}


				System.out.println("Media: " +  media);
				System.out.println("Maior Numero: "+  atualMaiorNum);
				System.out.println("A quantidade de vezes que caiu o maior numero: " + qtdMaiorNum);
				entrada.close();
	}

}
