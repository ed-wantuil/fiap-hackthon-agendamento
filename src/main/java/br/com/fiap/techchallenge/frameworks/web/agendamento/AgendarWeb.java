package br.com.fiap.techchallenge.frameworks.web.agendamento;

import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface AgendarWeb {

    @Operation(summary = "Criar Agendamento",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Criar Agendamento"),
            })
    @PostMapping("/agendamento")
    AgendamentoResponse agendar(@RequestBody AgendamentoRequest agendamentoRequest);
}
