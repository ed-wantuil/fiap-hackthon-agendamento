package br.com.fiap.techchallenge.frameworks.db.entities;

import java.time.LocalDateTime;

import br.com.fiap.techchallenge.frameworks.util.LocalDateConverter;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@DynamoDBTable(tableName = "agendamento")
@DynamoDBDocument
public class AgendamentoEntity {
    @DynamoDBHashKey(attributeName = "id")
    private String id;

    @DynamoDBAttribute(attributeName = "Paciente")
    private PacienteEntity paciente;

    @DynamoDBAttribute(attributeName = "medicoId")
    private String medicoId;

    @DynamoDBAttribute(attributeName = "data")
    @DynamoDBTypeConverted(converter = LocalDateConverter.class)
    private LocalDateTime data;

    @DynamoDBAttribute(attributeName = "status")
    private String status;

    @DynamoDBAttribute(attributeName = "justificativaCancelamento")
    private String justificativaCancelamento;
}
