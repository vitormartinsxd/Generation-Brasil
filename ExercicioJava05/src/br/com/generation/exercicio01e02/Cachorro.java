package br.com.generation.exercicio01e02;

public class Cachorro extends Animal implements Animal02 {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public void somAnimal() {
		System.out.println("Auauauhh....");
	}
	@Override
	public void CorrerOuSubir() {
		System.out.println("Cachcorro corre...");
		
	}
	
	
}
