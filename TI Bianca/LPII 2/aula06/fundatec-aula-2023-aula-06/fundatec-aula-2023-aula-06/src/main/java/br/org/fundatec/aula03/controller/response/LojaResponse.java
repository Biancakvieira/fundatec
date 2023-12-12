package br.org.fundatec.aula03.controller.response;

import br.org.fundatec.aula03.model.Endereco;
import br.org.fundatec.aula03.model.Loja;

public class LojaResponse {
    private Long id;

    private String nome;

    private Integer numeroCarros;

    private EnderecoResponse endereco;

    public static LojaResponse of(Loja loja) {
        return new LojaResponse(
                loja.getId(),
                loja.getNome(),
                loja.getNumeroCarros(),
                EnderecoResponse.of(loja.getEndereco())

        );
    }

    public LojaResponse(Long id, String nome, Integer numeroCarros, EnderecoResponse endereco) {
        this.id = id;
        this.nome = nome;
        this.numeroCarros = numeroCarros;
        this.endereco = endereco;
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

    public EnderecoResponse getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoResponse endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
