package com.fundatec.petshop.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Vacina {

    @Id
    @Column
    private String nomeVacina;

    @Column
    private LocalDate dataValidadeVacina;

    @Column
    private String doencasAplicaveis;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Mamifero mamifero;

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

    public Mamifero getProduto() {
        return mamifero;
    }

    public void setProduto(Produto produto) {
        this.mamifero = mamifero;
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
