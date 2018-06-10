package application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import application.repositories.LivreRepository;
import application.repositories.UsagerRepository;

@RestController
public abstract class BaseController {

	protected LivreRepository livreRepository;
	protected UsagerRepository usagerRepository;

	/**
	 * @param usagerRepository
	 *            the usagerRepository to set
	 */
	@Autowired
	public void setUsagerRepository(UsagerRepository usagerRepository) {
		this.usagerRepository = usagerRepository;
	}

	/**
	 * @param livreRepository
	 *            the livreRepository to set
	 */
	@Autowired
	public void setLivreRepository(LivreRepository livreRepository) {
		this.livreRepository = livreRepository;
	}

}
