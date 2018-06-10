package application.repositories;

import org.springframework.data.repository.CrudRepository;

import application.beans.Livre;

public interface LivreRepository extends CrudRepository<Livre, Integer> {

}
