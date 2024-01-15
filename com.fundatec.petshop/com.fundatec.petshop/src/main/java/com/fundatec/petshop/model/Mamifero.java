package com.fundatec.petshop.model;


import jakarta.persistence.Column;
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

public class Mamifero extends TipoAnimal{


    private String raca;

   private String possuiPelos;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPossuiPelos() {
        return possuiPelos;
    }

    public void setPossuiPelos(String possuiPelos) {
        this.possuiPelos = possuiPelos;
    }
}
