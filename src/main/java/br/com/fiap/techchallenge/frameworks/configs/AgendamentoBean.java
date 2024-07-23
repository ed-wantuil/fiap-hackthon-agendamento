package br.com.fiap.techchallenge.frameworks.configs;

import br.com.fiap.techchallenge.application.gateways.AgendamentoGateway;
import br.com.fiap.techchallenge.application.usecases.agendamento.Agendar;
import br.com.fiap.techchallenge.application.usecases.agendamento.AvaliarAgendamento;
import br.com.fiap.techchallenge.application.usecases.agendamento.impl.AgendarImpl;
import br.com.fiap.techchallenge.application.usecases.agendamento.impl.AvaliarAgendamentoImpl;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoToAgendamentoResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgendamentoBean {

    @Bean
    AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse() {
        return new AgendamentoToAgendamentoResponse();
    }

    @Bean
    Agendar agendar(final AgendamentoGateway agendamentoGateway) {
        return new AgendarImpl(agendamentoGateway);
    }

    @Bean
    AvaliarAgendamento avaliarAgendamento(final AgendamentoGateway agendamentoGateway) {
        return new AvaliarAgendamentoImpl(agendamentoGateway);
    }
}
