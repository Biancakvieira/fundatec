package com.fundatec.petshop.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

@Entity
public class Vacina {

    @Column
    private String nomeVacina;

    @Column
    private LocalDate dataValidadeVacina;

    @Column
    private String doencasAplicaveis;

    @OneToOne(mappedBy = "vacina", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Produto produto;

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public LocalDate getDataValidadeVacina() {
        return dataValidadeVacina;
    }

    public void setDataValidadeVacina(LocalDate dataValidadeVacina) {
        this.dataValidadeVacina = dataValidadeVacina;
    }

    public String getDoencasAplicaveis() {
        return doencasAplicaveis;
    }

    public void setDoencasAplicaveis(String doencasAplicaveis) {
        this.doencasAplicaveis = doencasAplicaveis;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean vacinaVencida() {
        if (dataValidadeVacina == null) {
            // Se a data de validade não foi definida, considere a vacina como vencida
            return true;
        }

        LocalDate agora = LocalDate.now();
        return agora.isAfter(dataValidadeVacina);
    }
}
