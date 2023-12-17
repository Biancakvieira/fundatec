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

    @OneToOne(mappedBy = "cliente", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Endereco endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nomeCliente;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nomeCliente, cliente.nomeCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCliente);
    }
}
