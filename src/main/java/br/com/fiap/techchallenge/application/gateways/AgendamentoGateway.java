package br.com.fiap.techchallenge.application.gateways;

import java.util.List;

import br.com.fiap.techchallenge.domain.entities.Agendamento;


public interface AgendamentoGateway {
    Agendamento atualizar(String id, Agendamento agendamento);

    Agendamento findById(String id);

    Agendamento criar(Agendamento agendamento);

    List<Agendamento> findAll();
}
