package br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters;

import br.com.fiap.techchallenge.domain.entities.Agendamento;
import br.com.fiap.techchallenge.domain.entities.Paciente;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AgendamentoRequestToAgendamento {

    public Agendamento convert(final AgendamentoRequest agendamentoRequest) {
        return Agendamento
                .builder()
                .paciente(convert(agendamentoRequest.paciente()))
                .medicoId(agendamentoRequest.medicoId())
                .data(agendamentoRequest.data())
                .justificativaCancelamento(agendamentoRequest.justificativaCancelamento())
                .build();
    }

    public Paciente convert(final AgendamentoRequest.PacienteRequest pacienteRequest) {
        return Paciente.builder()
                .nome(pacienteRequest.nome())
                .telefone(pacienteRequest.telefone())
                .build();
    }
}
