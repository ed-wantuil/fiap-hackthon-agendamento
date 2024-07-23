package br.com.fiap.techchallenge.interfaces.controllers.agendamento;

import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;

public interface CancelarAgendamentoController {

    AgendamentoResponse cancelarAgendamento(String id, String justificativa);
}
