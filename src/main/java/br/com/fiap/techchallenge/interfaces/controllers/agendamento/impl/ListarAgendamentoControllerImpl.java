package br.com.fiap.techchallenge.interfaces.controllers.agendamento.impl;

import java.util.List;

import br.com.fiap.techchallenge.application.usecases.agendamento.ListarAgendamento;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.ListarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoToAgendamentoResponse;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListarAgendamentoControllerImpl implements ListarAgendamentoController {

    private final ListarAgendamento listarAgendamento;

    private final AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse;

    @Override
    public List<AgendamentoResponse> listar() {

        var agendamentos = listarAgendamento.listar();

        return agendamentos.stream()
                .map(agendamentoToAgendamentoResponse::convert)
                .toList();
    }
}
