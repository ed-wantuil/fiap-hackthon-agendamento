package br.com.fiap.techchallenge.application.usecases.agendamento.impl;

import br.com.fiap.techchallenge.application.gateways.AgendamentoGateway;
import br.com.fiap.techchallenge.application.usecases.agendamento.CancelarAgendamento;
import br.com.fiap.techchallenge.domain.entities.Agendamento;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CancelarAgendamentoImpl implements CancelarAgendamento {

    private final AgendamentoGateway agendamentoGateway;

    @Override
    public Agendamento cancelar(String id, String justificativa) {
        Agendamento agendamento = agendamentoGateway.findById(id);

        agendamento.setStatus("CANCELADO");

        agendamento.setJustificativaCancelamento(justificativa);

        return agendamento;
    }
}
