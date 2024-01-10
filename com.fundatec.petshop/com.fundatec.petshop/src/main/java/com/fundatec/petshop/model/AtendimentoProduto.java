package com.fundatec.petshop.model;

import jakarta.persistence.*;

@Entity
public class AtendimentoProduto {

    @EmbeddedId
    private AtendimentoProdutoId id;

    @ManyToOne
    @MapsId("atendimento_id")
    @JoinColumn(name = "atendimento_id", referencedColumnName = "id")
    private Atendimento atendimento;

    @ManyToOne
    @MapsId("produto_id")
    @JoinColumn(name = "produto_id", referencedColumnName = "id")
    private Produto produto;

    private Integer quantidade;
    private String nomeUsuario;

    public AtendimentoProdutoId getId() {
        return id;
    }

    public void setId(AtendimentoProdutoId id) {
        this.id = id;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
