package br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses;

import java.time.LocalDateTime;

import lombok.Builder;


@Builder
public record AgendamentoResponse(String id,
                                  PacienteResponse paciente,
                                  String medicoId,
                                  LocalDateTime data,
                                  String status,
                                  String justificativaCancelamento) {

    @Builder
    public record PacienteResponse(String nome,
                                   String telefone) {
    }
}
