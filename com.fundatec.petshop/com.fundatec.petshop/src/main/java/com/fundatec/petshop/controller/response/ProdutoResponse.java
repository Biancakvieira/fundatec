package com.fundatec.petshop.controller.response;

import com.fundatec.petshop.model.Produto;
import lombok.Builder;

import java.util.List;


@Builder
public class ProdutoResponse {
    private Integer id;
    private Integer valor;
    private String nome;
    private String descricao;


    public static List<ProdutoResponse> of(List<Produto> produto) {
        return produto.stream()
                .map(ProdutoResponse::of)
                .toList();
    }

    public static ProdutoResponse of(Produto produto) {
        return ProdutoResponse.builder()
                .id(produto.getId())
                .valor(produto.getValor())
                .nome(produto.getNome())
                .descricao(produto.getDescricao())
                .build();
    }
}
