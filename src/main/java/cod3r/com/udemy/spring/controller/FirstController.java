package cod3r.com.udemy.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cod3r.com.udemy.spring.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class FirstController {

    @GetMapping("/default")
    public Cliente retornarObjeto() {
        return new Cliente(0, "nome", "123.456.789.10");
    }

}
