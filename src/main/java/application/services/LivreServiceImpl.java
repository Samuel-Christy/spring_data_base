package application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.beans.Livre;
import application.repositories.LivreRepository;

@Service
public class LivreServiceImpl implements LivreService {

	private LivreRepository livreRepository;

	/**
	 * @param livreRepository
	 *            the livreRepository to set
	 */
	@Autowired
	public void setLivreRepository(LivreRepository livreRepository) {
		this.livreRepository = livreRepository;
	}

	@Override
	public Iterable<Livre> listAllLivres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livre getLivreById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livre saveLivre(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

}
