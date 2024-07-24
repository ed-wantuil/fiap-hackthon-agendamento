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
        Agendamento agendamento = Agendamento.builder()
                .status("CANCELADO")
                .justificativaCancelamento(justificativa)
                .build();
        
        agendamento = agendamentoGateway.atualizar(id, agendamento);

        return agendamento;
    }
}
