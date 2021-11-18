package com.webservice.spring.controllers;

import com.webservice.spring.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/1")
    public Cliente obterCliente(){
        return new Cliente(1,"Pedro", "449-582-111-00");
    }
}
