package br.com.fiap.techchallenge.interfaces.controllers.agendamento.impl;

import br.com.fiap.techchallenge.application.usecases.agendamento.AvaliarAgendamento;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.AvaliarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoRequestToAgendamento;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoToAgendamentoResponse;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AvaliarAgendamentoControllerImpl implements AvaliarAgendamentoController {

    private final AvaliarAgendamento avaliarAgendamento;

    private final AgendamentoRequestToAgendamento agendamentoRequestToAgendamento;

    private final AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse;

    @Override
    public AgendamentoResponse avaliar(final String id, final AgendamentoRequest agendamentoRequest) {

        var agendamento = agendamentoRequestToAgendamento.convert(agendamentoRequest);

        agendamento = avaliarAgendamento.avaliar(id, agendamento);

        return agendamentoToAgendamentoResponse.convert(agendamento);
    }
}
