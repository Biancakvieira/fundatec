package br.org.fundatec.aula03.repository;

import br.org.fundatec.aula03.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, String> {
}
