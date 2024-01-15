package com.fundatec.petshop.controller;

import com.fundatec.petshop.controller.response.ProdutoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v0/produtos")
public class ProdutoController {
    @GetMapping
    public List<ProdutoResponse> producurarProdutos(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) Integer precoMaiorQue,
            @RequestParam(required = false) Integer precoMenorQue
    ) {
        return new ArrayList<>();
    }
}
