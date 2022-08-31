package br.org.generation.helloWord.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Crtl+Shif+O (Importa tudo)

@RestController //Se trata de um controle.
@RequestMapping("/hello") //Endereço onde sera acessado.

public class HelloController{
	
	@GetMapping //Coloque a informação a baixo no endereço
	public String hellowMessage(){
		return "Olá, Mundo! Vamos ao Sping (: ";
	}
	
	
}
