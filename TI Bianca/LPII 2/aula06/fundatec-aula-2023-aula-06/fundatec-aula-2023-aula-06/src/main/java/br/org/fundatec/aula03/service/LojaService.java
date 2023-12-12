package br.org.fundatec.aula03.service;

import br.org.fundatec.aula03.model.Loja;
import br.org.fundatec.aula03.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public Loja create(Loja loja) {
       return lojaRepository.save(loja);
    }

}
