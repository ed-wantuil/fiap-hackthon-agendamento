package br.com.fiap.techchallenge.frameworks.web.agendamento;

import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ListarAgendamentoWeb {

    @Operation(summary = "Listar agendamento",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Lista de agendamentos"),
            })
    @PostMapping("/agendamento")
    void listar(@RequestBody AgendamentoRequest agendamentoRequest);
}
