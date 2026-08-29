package cod3r.com.udemy.spring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/methods")
public class MethodsController {

    // Nota: como são verbos HTTP diferentes, não há ambiguidade de mapeamento.

    // Nota:
    // não tem como enviar requisições PUT ou DELETE através de um form em index.html.
    // seria necessário usar uma ferramenta como o Postman para testar esses endpoints.

    @GetMapping
    public String get() {
        return "requisição GET";
    }

    @PostMapping
    public String post() {
        return "requisição POST";
    }

    @PutMapping
    public String put() {
        return "requisição PUT";
    }

    @DeleteMapping
    public String delete() {
        return "requisição DELETE";
    }

}
