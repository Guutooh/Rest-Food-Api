package br.com.food.restfood.infraEstrutura.respository;

import br.com.food.restfood.domain.model.Permissao;

import java.util.List;

public interface PermissaoRepository {


    List<Permissao> todas();

    Permissao porId(Long id);

    Permissao adicionar(Permissao permissao);

    void remover(Permissao permissao);
}
