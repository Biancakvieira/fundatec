package com.fundatec.petshop.model;

import jakarta.persistence.Entity;

@Entity
public class Reptil extends TipoAnimal{
    private String peconhento;

    public String getPeconhento() {
        return peconhento;
    }

    public void setPeconhento(String peconhento) {
        this.peconhento = peconhento;
    }
}
