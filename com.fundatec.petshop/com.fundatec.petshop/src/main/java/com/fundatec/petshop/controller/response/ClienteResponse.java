package com.fundatec.petshop.controller.response;

import com.fundatec.petshop.model.Cliente;
import lombok.Builder;

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

@Builder
public class ClienteResponse {
    private Integer id;
    private String nome;
    private String cpf;
    private List<EnderecoResponse> endereco;
    public static ClienteResponse of(Cliente cliente) {
        return ClienteResponse.builder()
                .id(cliente.getId())
                .nome(cliente.getNomeCliente())
                .cpf(cliente.getCpf())
                .endereco(List.of(EnderecoResponse.of(cliente.getEndereco()))
                )
                .build();
    }
}
