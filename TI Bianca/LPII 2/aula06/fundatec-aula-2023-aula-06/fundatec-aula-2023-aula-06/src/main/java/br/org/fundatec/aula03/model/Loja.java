package br.org.fundatec.aula03.model;

import jakarta.persistence.*;

@Entity
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, unique = true, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer numeroCarros;

    @OneToOne(mappedBy = "loja", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Endereco endereco;

    public Loja(Long id, String nome, Integer numeroCarros, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.numeroCarros = numeroCarros;
        this.endereco = endereco;
    }

    public Loja() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroCarros() {
        return numeroCarros;
    }

    public void setNumeroCarros(Integer numeroCarros) {
        this.numeroCarros = numeroCarros;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
