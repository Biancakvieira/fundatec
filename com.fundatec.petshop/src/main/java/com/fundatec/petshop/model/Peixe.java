package com.fundatec.petshop.model;

import jakarta.persistence.Entity;

@Entity
public class Peixe extends TipoAnimal{

    private String tipoAgua;

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}
