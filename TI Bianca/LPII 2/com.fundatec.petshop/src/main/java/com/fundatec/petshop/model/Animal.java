package com.fundatec.petshop.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
@Entity
public class Animal {

    @Id
    @Column(length = 20)
    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private String classe;

    @Column(length = 20)
    private String raca;

    @Column
    private LocalDate dataNascimento;

    @OneToOne(mappedBy = "animal", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe ;
    }

    public void setClasse(String classe) {
        this.classe = classe;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

