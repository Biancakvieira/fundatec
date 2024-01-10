package com.fundatec.petshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Peixe extends TipoAnimal{
    @Enumerated(EnumType.STRING)
    @Column(length = 7, nullable = false)
    private TipoAgua tipoAgua;

    public TipoAgua getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}
