package br.com.food.restfood.infraEstrutura.respository;

import br.com.food.restfood.domain.model.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {


    List<FormaPagamento> todas();

    FormaPagamento porId(Long id);

    FormaPagamento adicionar(FormaPagamento formaPagamento);

    void remover(FormaPagamento formaPagamento);
}
