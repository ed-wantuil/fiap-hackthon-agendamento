package br.com.fiap.techchallenge.application.usecases.agendamento;

import br.com.fiap.techchallenge.domain.entities.Agendamento;

public interface AvaliarAgendamento {

    Agendamento avaliar(String id, Agendamento agendamento);
}
