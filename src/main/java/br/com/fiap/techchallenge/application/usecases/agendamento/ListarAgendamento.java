package br.com.fiap.techchallenge.application.usecases.agendamento;

import java.util.List;

import br.com.fiap.techchallenge.domain.entities.Agendamento;

public interface ListarAgendamento {
    List<Agendamento> listar();
}
