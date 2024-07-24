package br.com.fiap.techchallenge.frameworks.db.impl;

import java.util.List;
import java.util.stream.StreamSupport;

import br.com.fiap.techchallenge.application.gateways.AgendamentoGateway;
import br.com.fiap.techchallenge.domain.entities.Agendamento;
import br.com.fiap.techchallenge.frameworks.db.converters.AgendamentoEntityToAgendamento;
import br.com.fiap.techchallenge.frameworks.db.converters.AgendamentoToAgendamentoEntity;
import br.com.fiap.techchallenge.frameworks.db.entities.AgendamentoEntity;
import br.com.fiap.techchallenge.frameworks.db.repositories.SpringDataAgendamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AgendamentoRepositoryImpl implements AgendamentoGateway {

    private final SpringDataAgendamentoRepository springDataAgendamentoRepository;

    private final AgendamentoEntityToAgendamento agendamentoEntityToAgendamento;

    private final AgendamentoToAgendamentoEntity agendamentoToAgendamentoEntity;


    @Override
    public Agendamento atualizar(String id, Agendamento agendamento) {
        var agendamentoEntity = springDataAgendamentoRepository.findById(id).orElseThrow();

        agendamentoEntity.setStatus(agendamento.getStatus());
        agendamentoEntity.setJustificativaCancelamento(agendamento.getJustificativaCancelamento());

        agendamentoEntity = springDataAgendamentoRepository.save(agendamentoEntity);

        return agendamentoEntityToAgendamento.convert(agendamentoEntity);
    }

    @Override
    public Agendamento findById(final String id) {
        final var oderEntity = springDataAgendamentoRepository.findById(id).orElseThrow();

        return agendamentoEntityToAgendamento.convert(oderEntity);
    }

    @Override
    public Agendamento criar(Agendamento agendamento) {
        var agendamentoEntity = agendamentoToAgendamentoEntity.convert(agendamento);

        agendamentoEntity = springDataAgendamentoRepository.save(agendamentoEntity);

        return agendamentoEntityToAgendamento.convert(agendamentoEntity);
    }

    @Override
    public List<Agendamento> findAll() {
        Iterable<AgendamentoEntity> agendamentos = springDataAgendamentoRepository.findAll();

        return StreamSupport.stream(agendamentos.spliterator(), false)
                .map(agendamentoEntityToAgendamento::convert)
                .toList();

    }

}
