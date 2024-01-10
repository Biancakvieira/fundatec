package com.fundatec.petshop.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private LocalDateTime data_operacao;

    @Enumerated(EnumType.STRING)
    @Column(length = 7, nullable = false)
    private TipoOperacao tipo_operacao;

    @Column
    private Integer quantidade;

    @Column
    private Date validade;

    @Column (length = 20)
    private String lote;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Produto produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_operacao() {
        return data_operacao;
    }

    public void setData_operacao(LocalDateTime data_operacao) {
        this.data_operacao = data_operacao;
    }

    public TipoOperacao getTipo_operacao() {
        return tipo_operacao;
    }

    public void setTipo_operacao(TipoOperacao tipo_operacao) {
        this.tipo_operacao = tipo_operacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
