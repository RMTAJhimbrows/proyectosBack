package once.curso.proyectotienda.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import once.curso.proyectotienda.entities.Profile;

@Repository
public interface ProfileRepository extends PagingAndSortingRepository<Profile, Integer> {

}
