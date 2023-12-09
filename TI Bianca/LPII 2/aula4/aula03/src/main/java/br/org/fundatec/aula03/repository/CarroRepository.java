package br.org.fundatec.aula03;

import java.util.List;

public interface CarroRepository {

    List<Carro> listAllCarros();

    void saveCarro(Carro carro);

    void deleteCarro(String placa);

    void editCarro(String codigoPlaca,
                   Carro carro);
}
