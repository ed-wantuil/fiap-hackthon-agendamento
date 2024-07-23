package br.com.fiap.techchallenge.frameworks.db.repositories;

import br.com.fiap.techchallenge.frameworks.db.entities.AgendamentoEntity;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface SpringDataAgendamentoRepository extends CrudRepository<AgendamentoEntity, String> {

}
