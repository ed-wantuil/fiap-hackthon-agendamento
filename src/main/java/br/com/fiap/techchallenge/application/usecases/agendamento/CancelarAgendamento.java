package br.com.fiap.techchallenge.application.usecases.agendamento;

import br.com.fiap.techchallenge.domain.entities.Agendamento;

public interface CancelarAgendamento {

    Agendamento cancelar(String id, String justificativa);
}
