package com.fundatec.petshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Produto {
    @Id
    @Column(length = 20)
    private String nome;

    @Column(length = 20)
    private String marca;

    public String getNome() {
        return nome;}


        public void setNome (String nome){
            this.nome = nome;}


            public String getMarca () {
                return marca;}

                public void setMarca (String marca){
                    this.marca = marca;}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.marca);
                }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }
}



