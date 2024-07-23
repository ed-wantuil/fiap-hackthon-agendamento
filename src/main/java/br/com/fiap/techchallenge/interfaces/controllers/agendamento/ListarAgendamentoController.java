package br.com.fiap.techchallenge.interfaces.controllers.agendamento;

import java.util.List;

import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;

public interface ListarAgendamentoController {

    List<AgendamentoResponse> listar();
}
