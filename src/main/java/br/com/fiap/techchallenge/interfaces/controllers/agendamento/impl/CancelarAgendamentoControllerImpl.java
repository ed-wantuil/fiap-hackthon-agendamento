package br.com.fiap.techchallenge.interfaces.controllers.agendamento.impl;

import br.com.fiap.techchallenge.application.usecases.agendamento.CancelarAgendamento;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.CancelarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoToAgendamentoResponse;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CancelarAgendamentoControllerImpl implements CancelarAgendamentoController {

    private final CancelarAgendamento cancelarAgendamento;

    private final AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse;

    @Override
    public AgendamentoResponse cancelarAgendamento(String id, String justificativa) {

        var agendamento = cancelarAgendamento.cancelar(id, justificativa);

        return agendamentoToAgendamentoResponse.convert(agendamento);
    }
}
