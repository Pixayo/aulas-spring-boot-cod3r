package cod3r.com.udemy.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String ola() {
        return "Olá, esse é meu primeiro controller Spring Boot";
    }

}
