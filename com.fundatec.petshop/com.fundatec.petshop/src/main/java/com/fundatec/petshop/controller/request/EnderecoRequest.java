package com.fundatec.petshop.controller.request;

import com.fundatec.petshop.model.Endereco;
import lombok.Data;

@Data
public class EnderecoRequest {

    private String logradouro;
    private Integer numero;
    private String bairro;
    private String estado;
    private String cidade;

    public Endereco toModel() {
        return Endereco.builder()
                .logradouro(logradouro)
                .cidade(cidade)
                .bairro(bairro)
                .numero(numero)
                .build();
    }
}