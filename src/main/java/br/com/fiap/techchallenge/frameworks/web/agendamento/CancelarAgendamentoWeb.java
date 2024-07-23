package br.com.fiap.techchallenge.frameworks.web.agendamento;

import br.com.fiap.techchallenge.interfaces.controllers.agendamento.requests.AgendamentoRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CancelarAgendamentoWeb {

    @Operation(summary = "Avaliar agendamento",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Agendamento avaliado"),
            })
    @PutMapping("/agendmaento/{id}")
    void cancelar(@PathVariable String id, @RequestBody AgendamentoRequest agendamentoRequest);
}
