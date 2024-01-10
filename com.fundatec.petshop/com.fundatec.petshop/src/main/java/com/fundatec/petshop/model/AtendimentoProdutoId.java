package com.fundatec.petshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AtendimentoProdutoId {
    @Column(name = "produto_id", nullable = false)
    private Integer produtoId;

    @Column(name = "atendimento_id", nullable = false)
    private Integer atendimentoId;
}
