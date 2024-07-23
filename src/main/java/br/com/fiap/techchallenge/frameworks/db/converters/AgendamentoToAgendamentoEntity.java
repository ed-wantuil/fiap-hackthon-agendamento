package br.com.fiap.techchallenge.frameworks.db.converters;

import br.com.fiap.techchallenge.domain.entities.Agendamento;
import br.com.fiap.techchallenge.frameworks.db.entities.AgendamentoEntity;
import br.com.fiap.techchallenge.frameworks.db.entities.PacienteEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AgendamentoToAgendamentoEntity {

    public AgendamentoEntity convert(final Agendamento agendamento) {
        return AgendamentoEntity
                .builder()
                .id(agendamento.getId())
                .paciente(PacienteEntity.builder()
                        .nome(agendamento.getPaciente().getNome())
                        .telefone(agendamento.getPaciente().getTelefone())
                        .build())
                .medicoId(agendamento.getMedicoId())
                .data(agendamento.getData())
                .status(agendamento.getStatus())
                .justificativaCancelamento(agendamento.getJustificativaCancelamento())
                .build();
    }
}
