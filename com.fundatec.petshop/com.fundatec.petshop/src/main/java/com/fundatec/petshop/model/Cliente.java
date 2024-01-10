package com.fundatec.petshop.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Cliente {

    @Id
    @Column(length = 20)
    private String cpf;

    @Column(length = 20)
    private String nomeCliente;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

   }
