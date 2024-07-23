package br.com.fiap.techchallenge.interfaces.controllers.agendamento;

import br.com.fiap.techchallenge.domain.entities.Agendamento;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;

public interface AgendarController {

    AgendamentoResponse agendar(AgendamentoRequest agendamentoRequest);
}
