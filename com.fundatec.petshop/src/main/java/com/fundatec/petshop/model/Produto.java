package com.fundatec.petshop.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Produto {
    @Id
    @Column(length = 20)
    private String nome;

    @Column(length = 20)
    private String marca;

    @ManyToMany(mappedBy = "produto",cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Atendimento> atendimento;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private TipoAnimal tipoAnimal;

    public String getNome() {
        return nome;}


        public void setNome (String nome){
            this.nome = nome;}


            public String getMarca () {
                return marca;}

                public void setMarca (String marca){
                    this.marca = marca;}

}



