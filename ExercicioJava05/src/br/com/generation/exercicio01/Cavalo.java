package br.com.generation.exercicio01;

public class Cavalo extends Animal implements Animal02 {
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
		System.out.println("Neeeer....");
	}
	@Override
	public void CorrerOuSubir() {
		System.out.println("Cavalo corre....");
	}
	
	
}
