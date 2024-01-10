package com.fundatec.petshop.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
@Entity
public class Pet {

    @Id
    @Column(length = 20)
    private String nome;

    @Column(length = 20)
    private String raca;

    @Column
    private LocalDate dataNascimento;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Cliente cliente;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private TipoAnimal tipoAnimal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        LocalDate agora = LocalDate.now();
        return Period.between(dataNascimento, agora).getYears();
    }

    public void atualizarIdadeAutomaticamente() {
        LocalDate agora = LocalDate.now();
        int idadeAtual = getIdade();

        if (agora.isAfter(dataNascimento.plusYears(idadeAtual))) {
            // Aniversário já ocorreu este ano
            idadeAtual++;
        }
    }
}

