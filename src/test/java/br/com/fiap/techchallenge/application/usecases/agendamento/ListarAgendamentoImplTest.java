package br.com.fiap.techchallenge.application.usecases.agendamento;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import br.com.fiap.techchallenge.application.gateways.AgendamentoGateway;
import br.com.fiap.techchallenge.application.usecases.agendamento.impl.ListarAgendamentoImpl;
import br.com.fiap.techchallenge.domain.entities.Agendamento;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListarAgendamentoImplTest {

    @Mock
    private AgendamentoGateway agendamentoGateway;

    @InjectMocks
    private ListarAgendamentoImpl listarAgendamentoImpl;

    @Test
    void testFindOrderById() {
        Agendamento agendamento = Agendamento.builder()
                .id("1")
                .build();

        listarAgendamentoImpl.listar();

        verify(agendamentoGateway, times(1)).findAll();
    }
}
