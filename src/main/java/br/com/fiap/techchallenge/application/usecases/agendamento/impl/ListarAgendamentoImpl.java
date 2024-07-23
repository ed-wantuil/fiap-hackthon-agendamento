package br.com.fiap.techchallenge.application.usecases.agendamento.impl;

import java.util.List;

import br.com.fiap.techchallenge.application.gateways.AgendamentoGateway;
import br.com.fiap.techchallenge.application.usecases.agendamento.ListarAgendamento;
import br.com.fiap.techchallenge.domain.entities.Agendamento;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ListarAgendamentoImpl implements ListarAgendamento {

    final AgendamentoGateway agendamentoGateway;

    @Override
    public List<Agendamento> listar() {
        return agendamentoGateway.findAll();
    }
}
