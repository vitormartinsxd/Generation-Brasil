package br.org.generation.helloWord.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Se trata de um controle.
@RequestMapping("/obj") //Endereço onde sera acessado.
public class objController {
	


		
		@GetMapping //Coloque a informação a baixo no endereço
		public String objMessage(){
			return " 		Entender melhor o Spring boot, e aprimorar meu conhecimentos em Banco de Dados";
		}
		
		


}
