package application.services;

import application.beans.Livre;

public interface LivreService {

	Iterable<Livre> listAllLivres();

	Livre getLivreById(Integer id);

	Livre saveLivre(Livre livre);
}
