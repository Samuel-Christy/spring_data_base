package application.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.beans.Livre;

@RestController
public class DemoController extends BaseController {

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
