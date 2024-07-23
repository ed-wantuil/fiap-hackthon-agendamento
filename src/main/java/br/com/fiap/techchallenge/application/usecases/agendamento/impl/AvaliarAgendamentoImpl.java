package br.com.fiap.techchallenge.application.usecases.agendamento.impl;

import br.com.fiap.techchallenge.application.gateways.AgendamentoGateway;
import br.com.fiap.techchallenge.application.usecases.agendamento.AvaliarAgendamento;
import br.com.fiap.techchallenge.domain.entities.Agendamento;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AvaliarAgendamentoImpl implements AvaliarAgendamento {
    private final AgendamentoGateway agendamentoGateway;

    @Override
    public Agendamento avaliar(String id, Agendamento agendamento) {
        return agendamentoGateway.atualizar(id, agendamento);
    }
}
