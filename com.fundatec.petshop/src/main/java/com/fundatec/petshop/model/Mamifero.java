package com.fundatec.petshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Mamifero extends TipoAnimal{


    @Column(length = 20)
    private String raca;

    @Column(length = 20)
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
