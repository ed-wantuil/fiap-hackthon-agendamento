package br.com.fiap.techchallenge.frameworks.web.agendamento.impl;

import br.com.fiap.techchallenge.frameworks.web.agendamento.AvaliarAgendamentoWeb;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.AvaliarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AvaliarAgendamentoWebImpl implements AvaliarAgendamentoWeb {

    private final AvaliarAgendamentoController avaliarAgendamentoController;

    @Override
    public void avaliar(String id, AgendamentoRequest avaliacaoRequest) {
        avaliarAgendamentoController.avaliar(id, avaliacaoRequest);
    }
}
