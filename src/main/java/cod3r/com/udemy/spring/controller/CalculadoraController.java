package cod3r.com.udemy.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Desafio: criar um web service para somar/subtrair dois valore

@RestController
@RequestMapping("/calc")
public class CalculadoraController {

    @GetMapping("/somar")
    public int somar(@RequestParam int n1, @RequestParam int n2) {
        return n1 + n2;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam int n1, @RequestParam int n2) {
        return n1 - n2;
    }

}
