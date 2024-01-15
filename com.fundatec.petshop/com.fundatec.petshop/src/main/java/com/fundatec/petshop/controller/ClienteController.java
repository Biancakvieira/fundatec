package com.fundatec.petshop.controller;

import com.fundatec.petshop.controller.request.ClienteRequest;
import com.fundatec.petshop.controller.response.ClienteResponse;
import com.fundatec.petshop.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/api/v0/clientes")
public class ClienteController {
    private List<Cliente> clientes = new ArrayList<>();
    @RequestMapping
        public List<ClienteResponse> listaClientes(@RequestParam(required = false) String nome) {

        return clientes.stream()
                .map(ClienteResponse::of)
                .toList();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCliente(@RequestBody ClienteRequest clienteRequest){
        this.clientes.add(clienteRequest.toModel());
    }

}
