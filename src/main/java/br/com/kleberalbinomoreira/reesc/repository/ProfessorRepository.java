package br.com.kleberalbinomoreira.reesc.repository;

import br.com.kleberalbinomoreira.reesc.orm.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Long> {


}
