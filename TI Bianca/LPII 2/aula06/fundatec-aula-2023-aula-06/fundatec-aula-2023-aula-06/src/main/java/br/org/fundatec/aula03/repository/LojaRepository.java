package br.org.fundatec.aula03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.org.fundatec.aula03.model.Loja;


public interface LojaRepository extends JpaRepository<Loja, Long> {
}
