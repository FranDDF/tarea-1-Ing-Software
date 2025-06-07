package com.miapp.probandoGET.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/")
    public String probando() {
        return "Spring Boot es una herramienta para desarrollar APIs en Java";
    }
}
