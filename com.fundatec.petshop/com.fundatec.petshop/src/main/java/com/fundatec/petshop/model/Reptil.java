package com.fundatec.petshop.model;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
public class Reptil extends TipoAnimal{
    private String peconhento;

    public String getPeconhento() {
        return peconhento;
    }

    public void setPeconhento(String peconhento) {
        this.peconhento = peconhento;
    }
}
