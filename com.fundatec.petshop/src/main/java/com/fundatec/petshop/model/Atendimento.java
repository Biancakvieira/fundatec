package com.fundatec.petshop.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity


public class Atendimento {
@Id private Integer id;
    @Column
    private LocalDate dataAtendimento;

    @Column(length = 30)
    private String nome_atendente;

    @Column(length = 20)
    private String pag_efetuado;

    private String valor_consulta;

    @Column(length = 10)
    private String estado;
    @Column(length = 20)
    private String nome_veterinario;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Cliente cliente;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Unidade unidade;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Pet pet;

    @ManyToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Produto> produto;

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getNome_atendente() {
        return nome_atendente;
    }

    public void setNome_atendente(String nome_atendente) {
        this.nome_atendente = nome_atendente;
    }

    public String getPag_efetuado() {
        return pag_efetuado;
    }

    public void setPag_efetuado(String pag_efetuado) {
        this.pag_efetuado = pag_efetuado;
    }

    public String getValor_consulta() {
        return valor_consulta;
    }

    public void setValor_consulta(String valor_consulta) {
        this.valor_consulta = valor_consulta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome_veterinario() {
        return nome_veterinario;
    }

    public void setNome_veterinario(String nome_veterinario) {
        this.nome_veterinario = nome_veterinario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}