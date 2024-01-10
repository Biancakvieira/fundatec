package com.fundatec.petshop.model;

import jakarta.persistence.*;

@Entity
public class QuantidadeEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer quantidade_atual;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade_atual() {
        return quantidade_atual;
    }

    public void setQuantidade_atual(Integer quantidade_atual) {
        this.quantidade_atual = quantidade_atual;
    }
}
