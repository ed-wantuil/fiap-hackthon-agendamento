package br.com.fiap.techchallenge.frameworks.web.agendamento.impl;

import java.util.List;

import br.com.fiap.techchallenge.frameworks.web.agendamento.ListarAgendamentoWeb;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.ListarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListarAgendamentoWebImpl implements ListarAgendamentoWeb {

    private final ListarAgendamentoController listarAgendamentoController;

    @Override
    public List<AgendamentoResponse> listar() {
        return listarAgendamentoController.listar();
    }
}
