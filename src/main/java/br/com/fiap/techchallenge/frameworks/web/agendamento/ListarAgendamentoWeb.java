package br.com.fiap.techchallenge.frameworks.web.agendamento;

import java.util.List;

import br.com.fiap.techchallenge.interfaces.controllers.agendamento.responses.AgendamentoResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ListarAgendamentoWeb {

    @Operation(summary = "Listar agendamento",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Lista de agendamentos"),
            })
    @GetMapping("/agendamento")
    List<AgendamentoResponse> listar();
}
