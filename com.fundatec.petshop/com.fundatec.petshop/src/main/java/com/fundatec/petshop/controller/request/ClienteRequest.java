package com.fundatec.petshop.controller.request;

import com.fundatec.petshop.model.Cliente;
import lombok.Data;

@Data
public class ClienteRequest {
    /*{
        "nome": "Marta",
                "cpf": "000.000.000-00",
                "endereco": {
            "logradouro": "Av. Ipiranga",
                    "numero": 1200,
                    "bairro": "Jardim Carvalho",
                    "cidade": "Porto Alegre",
                    "estado": "RS"
        }
    }*/


        private String nome;
        private String cpf;
        private EnderecoRequest endereco;

        public Cliente toModel() {
                return Cliente.builder()
                        .nomeCliente(nome)
                        .cpf(cpf)
                        .endereco(endereco.toModel())
                        .build();
        }
}
