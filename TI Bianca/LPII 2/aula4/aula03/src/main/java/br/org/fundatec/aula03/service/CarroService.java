package br.org.fundatec.aula03.repository;


import br.org.fundatec.aula03.model.Carro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listAllCarros() {
        return carroRepository.listAllCarros();
    }

    public void saveCarro(Carro carro) {
        carroRepository.saveCarro(carro);
    }

    public void deleteCarro(String placa) {
        carroRepository.deleteCarro(placa);

    }

    public void editCarro(String codigoPlaca,
                          Carro carro) {
        carroRepository.editCarro(codigoPlaca, carro);

    }


}
