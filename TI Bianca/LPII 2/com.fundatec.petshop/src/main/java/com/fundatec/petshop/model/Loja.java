package com.fundatec.petshop.model;

import jakarta.persistence.*;

@Entity
public class Loja {

    @Id
    @Column(length = 20)
    private String nomeLoja;

    @OneToOne(mappedBy = "loja", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Endereco endereco;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
