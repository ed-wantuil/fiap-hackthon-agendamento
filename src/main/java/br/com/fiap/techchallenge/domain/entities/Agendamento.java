package br.com.fiap.techchallenge.domain.entities;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Agendamento {
    
    private String id;
    private Paciente paciente;
    private String medicoId;
    private LocalDateTime data;
    private String status;
    private String justificativaCancelamento;
}
