package br.com.fiap.techchallenge.frameworks.db.converters;

import br.com.fiap.techchallenge.domain.entities.Agendamento;
import br.com.fiap.techchallenge.domain.entities.Paciente;
import br.com.fiap.techchallenge.frameworks.db.entities.AgendamentoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AgendamentoEntityToAgendamento {

    public Agendamento convert(final AgendamentoEntity agendamentoEntity) {
        return Agendamento
                .builder()
                .id(agendamentoEntity.getId())
                .paciente(Paciente.builder()
                        .nome(agendamentoEntity.getPaciente().getNome())
                        .telefone(agendamentoEntity.getPaciente().getTelefone())
                        .build())
                .medicoId(agendamentoEntity.getMedicoId())
                .data(agendamentoEntity.getData())
                .status(agendamentoEntity.getStatus())
                .justificativaCancelamento(agendamentoEntity.getJustificativaCancelamento())
                .build();
    }
}
