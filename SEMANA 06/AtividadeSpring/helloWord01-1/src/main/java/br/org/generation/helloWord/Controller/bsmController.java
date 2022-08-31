package br.org.generation.helloWord.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Crtl+Shif+O (Importa tudo)

@RestController //Se trata de um controle.
@RequestMapping("/bsm") //Endereço onde sera acessado.

public class bsmController{
	
	@GetMapping //Coloque a informação a baixo no endereço
	public String bsmMessage(){
		return "BSM - Orientação ao Futuro" + 
				"\n Responsabilidade pessoal" +  
				"\n Mentalidade de crescimento" + 
				"\n Persistência";
	}
	
	
}