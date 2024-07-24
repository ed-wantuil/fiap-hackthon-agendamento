package br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters;

import static java.util.Objects.isNull;

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
                .status(agendamentoRequest.status())
                .justificativaCancelamento(agendamentoRequest.justificativaCancelamento())
                .build();
    }

    public Paciente convert(final AgendamentoRequest.PacienteRequest pacienteRequest) {

        if (isNull(pacienteRequest)) {
            return null;
        }

        return Paciente.builder()
                .nome(pacienteRequest.nome())
                .telefone(pacienteRequest.telefone())
                .build();
    }
}
