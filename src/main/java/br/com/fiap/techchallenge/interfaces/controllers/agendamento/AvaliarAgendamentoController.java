package br.com.fiap.techchallenge.interfaces.controllers.agendamento;

import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;

public interface AvaliarAgendamentoController {

    AgendamentoResponse avaliar(String id, AgendamentoRequest agendamentoRequest);
}
