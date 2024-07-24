package br.com.fiap.techchallenge.frameworks.configs;

import br.com.fiap.techchallenge.application.gateways.AgendamentoGateway;
import br.com.fiap.techchallenge.application.usecases.agendamento.Agendar;
import br.com.fiap.techchallenge.application.usecases.agendamento.AvaliarAgendamento;
import br.com.fiap.techchallenge.application.usecases.agendamento.CancelarAgendamento;
import br.com.fiap.techchallenge.application.usecases.agendamento.ListarAgendamento;
import br.com.fiap.techchallenge.application.usecases.agendamento.impl.AgendarImpl;
import br.com.fiap.techchallenge.application.usecases.agendamento.impl.AvaliarAgendamentoImpl;
import br.com.fiap.techchallenge.application.usecases.agendamento.impl.CancelarAgendamentoImpl;
import br.com.fiap.techchallenge.application.usecases.agendamento.impl.ListarAgendamentoImpl;
import br.com.fiap.techchallenge.frameworks.web.agendamento.AgendarWeb;
import br.com.fiap.techchallenge.frameworks.web.agendamento.AvaliarAgendamentoWeb;
import br.com.fiap.techchallenge.frameworks.web.agendamento.CancelarAgendamentoWeb;
import br.com.fiap.techchallenge.frameworks.web.agendamento.ListarAgendamentoWeb;
import br.com.fiap.techchallenge.frameworks.web.agendamento.impl.AgendarWebImpl;
import br.com.fiap.techchallenge.frameworks.web.agendamento.impl.AvaliarAgendamentoWebImpl;
import br.com.fiap.techchallenge.frameworks.web.agendamento.impl.CancelarAgendamentoWebImpl;
import br.com.fiap.techchallenge.frameworks.web.agendamento.impl.ListarAgendamentoWebImpl;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.AgendarController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.AvaliarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.CancelarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.ListarAgendamentoController;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoRequestToAgendamento;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.converters.AgendamentoToAgendamentoResponse;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.impl.AgendarControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.impl.AvaliarAgendamentoControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.impl.CancelarAgendamentoControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.impl.ListarAgendamentoControllerImpl;
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

    @Bean
    ListarAgendamentoWeb listarAgendamentoWeb(ListarAgendamentoController listarAgendamentoController) {
        return new ListarAgendamentoWebImpl(listarAgendamentoController);
    }

    @Bean
    ListarAgendamento listarAgendamento(AgendamentoGateway agendamentoGateway) {
        return new ListarAgendamentoImpl(agendamentoGateway);
    }

    @Bean
    ListarAgendamentoController listarAgendamentoController(ListarAgendamento listarAgendamento,
                                                            AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse) {
        return new ListarAgendamentoControllerImpl(listarAgendamento, agendamentoToAgendamentoResponse);
    }

    @Bean
    AgendarWeb agendarWeb(AgendarController agendarController) {
        return new AgendarWebImpl(agendarController);
    }

    @Bean
    AgendarController agendarController(Agendar agendar, AgendamentoRequestToAgendamento agendamentoRequestToAgendamento,
                                        AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse) {
        return new AgendarControllerImpl(agendar, agendamentoRequestToAgendamento, agendamentoToAgendamentoResponse);
    }

    @Bean
    AgendamentoRequestToAgendamento agendamentoRequestToAgendamento() {
        return new AgendamentoRequestToAgendamento();
    }

    @Bean
    AvaliarAgendamentoWeb avaliarAgendamentoWeb(AvaliarAgendamentoController avaliarAgendamentoController) {
        return new AvaliarAgendamentoWebImpl(avaliarAgendamentoController);
    }

    @Bean
    AvaliarAgendamentoController avaliarAgendamentoController(AvaliarAgendamento avaliarAgendamento,
                                                              AgendamentoRequestToAgendamento agendamentoRequestToAgendamento,
                                                              AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse) {
        return new AvaliarAgendamentoControllerImpl(avaliarAgendamento, agendamentoRequestToAgendamento, agendamentoToAgendamentoResponse);
    }

    @Bean
    CancelarAgendamentoWeb cancelarAgendamentoWeb(CancelarAgendamentoController cancelarAgendamentoController) {
        return new CancelarAgendamentoWebImpl(cancelarAgendamentoController);
    }

    @Bean
    CancelarAgendamentoController cancelarAgendamentoController(CancelarAgendamento cancelarAgendamento,
                                                                AgendamentoToAgendamentoResponse agendamentoToAgendamentoResponse) {
        return new CancelarAgendamentoControllerImpl(cancelarAgendamento, agendamentoToAgendamentoResponse);
    }

    @Bean
    CancelarAgendamento cancelarAgendamento(AgendamentoGateway agendamentoGateway) {
        return new CancelarAgendamentoImpl(agendamentoGateway);
    }
}
