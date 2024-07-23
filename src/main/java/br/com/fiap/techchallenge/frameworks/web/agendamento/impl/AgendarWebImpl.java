package br.com.fiap.techchallenge.frameworks.web.agendamento.impl;

import br.com.fiap.techchallenge.frameworks.web.agendamento.AgendarWeb;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.AgendarController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AgendarWebImpl implements AgendarWeb {

    final AgendarController agendarController;

    @Override
    public AgendamentoResponse agendar(AgendamentoRequest agendamentoRequest) {
        return agendarController.agendar(agendamentoRequest);
    }
}
