package com.fundatec.petshop.controller.response;

import lombok.Data;

import java.util.List;

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
@Data
public class ClienteResponse {
    private Integer id;
    private String nome;
    private String cpf;
    private List<EnderecoResponse> endereco;

}
