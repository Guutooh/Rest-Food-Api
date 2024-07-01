package br.com.food.restfood.infraEstrutura.respository;

import br.com.food.restfood.domain.model.Restaurante;

import java.math.BigDecimal;
import java.util.List;

public interface RestauranteRepositoryQueries {
    List<Restaurante> find(String nome, BigDecimal taxaFreteInial, BigDecimal taxaFreteFinal);


    List<Restaurante> findComFreteGratis(String nome);

}
