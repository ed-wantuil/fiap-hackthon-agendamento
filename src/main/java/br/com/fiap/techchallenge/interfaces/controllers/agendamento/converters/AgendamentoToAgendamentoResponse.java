package br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters;

import br.com.fiap.techchallenge.domain.entities.Agendamento;
import br.com.fiap.techchallenge.domain.entities.Paciente;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AgendamentoToAgendamentoResponse {

    public AgendamentoResponse convert(final Agendamento agendamento) {
        return AgendamentoResponse
                .builder()
                .id(agendamento.getId())
                .paciente(convert(agendamento.getPaciente()))
                .medicoId(agendamento.getMedicoId())
                .data(agendamento.getData())
                .status(agendamento.getStatus())
                .justificativaCancelamento(agendamento.getJustificativaCancelamento())
                .build();
    }

    public AgendamentoResponse.PacienteResponse convert(final Paciente paciente) {
        return AgendamentoResponse.PacienteResponse.builder()
                .nome(paciente.getNome())
                .telefone(paciente.getTelefone())
                .build();
    }
}
