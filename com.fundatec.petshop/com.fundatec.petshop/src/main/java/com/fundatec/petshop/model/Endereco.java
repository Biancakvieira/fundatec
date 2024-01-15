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

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String logradouro;

    private String bairro;

    private String cidade;
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Cliente cliente;

    private Integer numero;

    @OneToOne
    @JoinColumn(name = "animal_id")
    private Pet animal;

}
