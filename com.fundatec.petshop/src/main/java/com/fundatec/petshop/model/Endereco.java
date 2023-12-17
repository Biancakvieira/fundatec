package com.fundatec.petshop.model;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private String tipo;

    @Column(length = 80, nullable = false)
    private String rua;

    @Column(length = 80, nullable = false)
    private String bairro;

    @Column(length = 40, nullable = false)
    private String cidade;
    @Enumerated(EnumType.STRING)
    @Column(length = 2, nullable = false)
    private Estado estado;

    @Column(nullable = false)
    private Integer numero;

    @OneToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    public Endereco(Long id, String rua, String bairro, String cidade, Estado estado, Integer numero) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

    public Endereco() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
