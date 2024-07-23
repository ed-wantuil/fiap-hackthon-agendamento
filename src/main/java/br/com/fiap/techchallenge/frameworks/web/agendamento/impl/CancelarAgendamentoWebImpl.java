package br.com.fiap.techchallenge.frameworks.web.agendamento.impl;

import br.com.fiap.techchallenge.frameworks.web.agendamento.CancelarAgendamentoWeb;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.CancelarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CancelarAgendamentoWebImpl implements CancelarAgendamentoWeb {

    private final CancelarAgendamentoController cancelarAgendamentoController;

    @Override
    public void cancelar(String id, AgendamentoRequest agendamentoRequest) {
        cancelarAgendamentoController.cancelarAgendamento(id, agendamentoRequest.justificativaCancelamento());
    }
}
