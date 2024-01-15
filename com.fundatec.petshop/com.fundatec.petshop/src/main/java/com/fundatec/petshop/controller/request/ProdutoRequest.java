package com.fundatec.petshop.controller.request;


import com.fundatec.petshop.model.Produto;
import lombok.Data;


@Data
public class ProdutoRequest {
    /*{
    "nome": "Biscoito",
    "preco": 1200,
    "descricao": "Biscoito maizena"
}*/
    private String nome;
    private String marca;
    private Integer valor;
    private String descricao;

    public Produto toModel() {
        return Produto.builder()
                .nome(nome)
                .marca(marca)
                .valor(valor)
                .descricao(descricao)
                .build();
    }
}
