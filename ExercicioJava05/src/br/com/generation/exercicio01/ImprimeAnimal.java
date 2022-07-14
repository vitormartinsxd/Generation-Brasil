package br.com.generation.exercicio01;

public class ImprimeAnimal {

	public static void main(String[] args) {
		TestaAnimal tA = new TestaAnimal();
		Cachorro c = new Cachorro();
		Preguica p = new Preguica();
		Cavalo cav = new Cavalo();
		
		
		System.out.println(" Som dos animais:  ");
		tA.somAnimal(new Cachorro());
		tA.somAnimal(new Preguica());
		tA.somAnimal(new Cavalo());
		System.out.println();
		//tA.somAnimal(new Animal());  --> Da erro, pois deixei a classe abstrata
		
		System.out.println("Correr ou subir: ");
		c.CorrerOuSubir();
		p.CorrerOuSubir();
		cav.CorrerOuSubir();
		System.out.println();
		
		System.out.println("			Cachorro");
		c.setNome("Pitty");
		c.setIdade(5);
		System.out.println("Nome do meu cachorro é " + c.getNome() + " e sua idade é " + c.getIdade() + " anos...");
		
		System.out.println("			Cavalo");
		cav.setNome("Yanrantuck");
		c.setIdade(10);
		System.out.println("Nome do meu cavalo é " + cav.getNome() + " e sua idade é " + cav.getIdade() + " anos...");
		
		System.out.println("			Preguiça");
		p.setNome("Pituca");
		p.setIdade(15);
		System.out.println("Nome da minha preguiça é " + p.getNome() + " e sua idade é " + p.getIdade() + " anos...");
		
		
		
	}

}
