package application.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.beans.Livre;
import application.repositories.LivreRepository;

@RestController
public class IndexController {

	private LivreRepository livreRepository;

	/**
	 * @param livreRepository
	 *            the livreRepository to set
	 */
	@Autowired
	public void setLivreRepository(LivreRepository livreRepository) {
		this.livreRepository = livreRepository;
	}

	@RequestMapping("/pouet")
	String index() {
		Livre l = new Livre();
		l.setNom_auteur("Bob");
		livreRepository.save(l);
		return l.toString();
	}

	@RequestMapping("/pouet/{id}")
	String get() {
		Optional<Livre> l = livreRepository.findById(1);

		return l.toString();
	}
}
