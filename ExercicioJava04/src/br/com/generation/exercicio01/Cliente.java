package br.com.generation.exercicio01;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		TestaCliente cl = new TestaCliente();
		
		cl.setLogin(	"vitormartins");
		System.out.println("Login: " + cl.getLogin());
		
		cl.setSenha(	56742457);
		System.out.println("Senha: " + cl.getSenha());
		
		cl.setIdade(	23);
		System.out.println("Idade: " + cl.getIdade());
		
		cl.setCpf(		567456748);
		System.out.println("CPF: " + cl.getCpf());
		
		Cadastro("vitormsousa", "56742457");
		
		
	}

	public static void Cadastro(String login, String senha) {
		System.out.println();
		System.out.println("	Login: " + login);
		System.out.println("	Senha: " + senha);
		
	}
}
