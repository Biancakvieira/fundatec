package com.fundatec.petshop.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import java.util.Objects;


public class Atendimento {

    @Column
    private LocalDate dataAtendimento;

    @Column(length = 30)
    private String nome_atendente;

    @Column(length = 20)
    private String pag_efetuado;

    @Column(length = 20)
    private String valor_consulta;

    @Column(length = 20)
    private String nome_veterinario;

    @OneToOne(mappedBy = "atendimento", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Cliente cliente;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atendimento atendimento = (Atendimento) o;
        return Objects.equals(cliente, atendimento.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente);
    }
}

