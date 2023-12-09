package br.org.fundatec.aula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PessoaController {
    private List<Pessoa> pessoas = List.of(
            new Pessoa("Aline", 18, "0000000"),
            new Pessoa("João", 22, "11111111"),
            new Pessoa("Barbara", 32, "0000002")
    );

    @GetMapping(path = "/pessoas")
    public List<Pessoa> listPessoas() {
        return pessoas;

    }

    @PostMapping(path = "/pessoas")
    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
}
