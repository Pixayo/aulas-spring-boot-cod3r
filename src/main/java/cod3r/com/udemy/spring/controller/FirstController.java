package cod3r.com.udemy.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    // Simulação de erro: ambiguidade no mapeamento de rotas
    // Ocorre quando dois métodos são mapeados para a mesma rota e possuem o mesmo verbo HTTP

    // Neste caso, a rota "/intencional" e o método GET

    @GetMapping(path = "/intencional")
    public String ola() {
        return "Olá, esse é meu primeiro controller Spring Boot";
    }

    @GetMapping(path = "/intencional")
    public String saudacao() {
        return "Olá, esse é meu primeiro controller Spring Boot";
    }

}
