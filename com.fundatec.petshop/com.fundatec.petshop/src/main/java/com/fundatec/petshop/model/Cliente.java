package com.fundatec.petshop.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cpf;

    private String nomeCliente;

    private String identidade;

    @OneToOne
    @JoinColumn(name = "", columnDefinition = "string")
    private Endereco endereco;

}