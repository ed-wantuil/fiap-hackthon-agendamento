package br.com.fiap.techchallenge.frameworks.web.agendamento.impl;

import java.util.List;

import br.com.fiap.techchallenge.application.usecases.agendamento.ListarAgendamento;
import br.com.fiap.techchallenge.domain.entities.Agendamento;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListarAgendamentoWebImpl implements ListarAgendamento {

    private final ListarAgendamento listarAgendamento;

    @Override
    public List<Agendamento> listar() {
        return listarAgendamento.listar();
    }
}
