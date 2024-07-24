package br.com.fiap.techchallenge.application.usecases.agendamento.impl;

import java.util.UUID;

import br.com.fiap.techchallenge.application.gateways.AgendamentoGateway;
import br.com.fiap.techchallenge.application.usecases.agendamento.Agendar;
import br.com.fiap.techchallenge.domain.entities.Agendamento;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AgendarImpl implements Agendar {

    private final AgendamentoGateway agendamentoGateway;

    @Override
    public Agendamento agendar(Agendamento agendamento) {
        agendamento.setId(UUID.randomUUID().toString());
        return agendamentoGateway.criar(agendamento);
    }
}
