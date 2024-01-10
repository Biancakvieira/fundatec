package com.fundatec.petshop.controller;

import com.fundatec.petshop.controller.response.ClienteResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @RequestMapping

    public List<ClienteResponse> listaClientes() {
        //logica p obter e retornar lista clientes
        ClienteResponse cliente = new ClienteResponse();
        cliente.setNome("nome");
        return new ArrayList<>();
    }

}
