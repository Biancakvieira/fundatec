package com.fundatec.petshop.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Pagamento {

    @Column
    @Id
    private Integer id;
    @Column
    private Integer valor;

    @Column
    private LocalDate dataPagamento;


    @Enumerated(EnumType.STRING)
    @Column(length = 7, nullable = false)
    private FormaPagamento formaPagamento;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Atendimento atendimentoe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Atendimento getAtendimentoe() {
        return atendimentoe;
    }

    public void setAtendimentoe(Atendimento atendimentoe) {
        this.atendimentoe = atendimentoe;
    }
}
