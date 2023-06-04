package once.curso.proyectotienda.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import once.curso.proyectotienda.entities.Configuration;

@Repository
public interface ConfigurationRepository extends PagingAndSortingRepository<Configuration, Integer> {

}
