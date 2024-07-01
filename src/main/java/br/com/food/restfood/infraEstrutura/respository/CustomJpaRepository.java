package br.com.food.restfood.infraEstrutura.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface CustomJpaRepository<T,ID> extends JpaRepository<T,ID> {

    Optional<T> buscarPrimeiro();


}
