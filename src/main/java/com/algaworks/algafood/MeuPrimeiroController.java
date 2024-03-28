package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//Criamos um método simples abaixo
@Controller
public class MeuPrimeiroController {
    @GetMapping("/hello")
    //ou seja, quando houver a chamada na URL de localhost:8080/hello, ele
    //irá devolver a frase do return(Resposta)
    @ResponseBody
    public String hello() {
        return "Helloggg";
    }
}
