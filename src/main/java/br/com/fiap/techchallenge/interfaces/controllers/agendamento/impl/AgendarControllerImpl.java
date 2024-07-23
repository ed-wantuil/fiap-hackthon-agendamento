package br.com.fiap.techchallenge.interfaces.controllers.agendamento.impl;

import br.com.fiap.techchallenge.application.usecases.agendamento.Agendar;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.AgendarController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoRequestToAgendamento;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoToAgendamentoResponse;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AgendarControllerImpl implements AgendarController {

    private final Agendar agendar;

    private final AgendamentoRequestToAgendamento agendamentoRequestToAgendamento;

    private final AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse;

    @Override
    public AgendamentoResponse agendar(final AgendamentoRequest agendamentoRequest) {

        var agendamento = agendamentoRequestToAgendamento.convert(agendamentoRequest);

        agendamento = agendar.agendar(agendamento);

        return agendamentoToAgendamentoResponse.convert(agendamento);
    }
}
