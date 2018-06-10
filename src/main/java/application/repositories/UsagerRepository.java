package application.repositories;

import org.springframework.data.repository.CrudRepository;

import application.beans.Usager;

public interface UsagerRepository extends CrudRepository<Usager, Integer> {

}
