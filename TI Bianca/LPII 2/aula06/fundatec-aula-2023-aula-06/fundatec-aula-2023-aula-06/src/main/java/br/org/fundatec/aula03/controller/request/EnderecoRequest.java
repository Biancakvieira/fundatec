package br.org.fundatec.aula03.controller.request;

import br.org.fundatec.aula03.model.Endereco;
import br.org.fundatec.aula03.model.Estado;
import br.org.fundatec.aula03.model.Loja;
import jakarta.persistence.*;

public class EnderecoRequest {

    private String rua;

    private String bairro;

    private String cidade;

    private Estado estado;

    private Integer numero;

    public Endereco toModel() {
        return new Endereco(null, rua, bairro, cidade, estado, numero);
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


}
