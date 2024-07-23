package br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests;

import java.time.LocalDateTime;

import lombok.Builder;

@Builder
public record AgendamentoRequest(PacienteRequest paciente,
                                 String medicoId,
                                 LocalDateTime data,
                                 String status,
                                 String justificativaCancelamento) {

    @Builder
    public record PacienteRequest(String nome,
                                  String telefone) {
    }
}
