package com.fundatec.petshop.controller.response;

/*{
    "nome": "Marta",
    "cpf": "000.000.000-00",
    "endereco":
        "id :
        "logradouro": "Av. Ipiranga",
        "numero": 1200,
        "bairro": "Jardim Carvalho",
        "cidade": "Porto Alegre",
        "estado": "RS"
    }
}*/

import com.fundatec.petshop.model.Endereco;
import lombok.Builder;

import java.util.List;
@Builder
public class EnderecoResponse {
    private Integer id;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;

    public static List<EnderecoResponse> of(List<Endereco> endereco) {
        return endereco.stream()
                .map(EnderecoResponse::of)
                .toList();
    }

    public static EnderecoResponse of(Endereco endereco) {
        return EnderecoResponse.builder()
                .id(endereco.getId())
                .bairro(endereco.getBairro())
                .cidade(endereco.getCidade())
                .numero(endereco.getNumero())
                .logradouro(endereco.getLogradouro())
                .build();
    }
}
