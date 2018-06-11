package application.config;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;

import application.beans.Livre;
import application.beans.Usager;
import application.repositories.LivreRepository;
import application.repositories.UsagerRepository;

@Configuration
public class DBInitializeConfig {

	@Autowired
	private DataSource dataSource;

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

	@PostConstruct
	public void initialize() {
		Faker fk = new Faker();
		Random r = new Random();
		if (livreRepository.count() == 0) {
			for (int i = 0; i < 30; i++) {
				Livre l = new Livre();
				l.setTitre(fk.book().title());
				l.setEditeur(fk.book().publisher());
				l.setNom_auteur(fk.name().lastName());
				l.setPrenom_auteur(fk.name().firstName());
				l.setAnnee(1492 + r.nextInt(2018 - 1492));
				livreRepository.save(l);
			}
		}

		if (usagerRepository.count() == 0) {
			for (int i = 0; i < 10; i++) {
				Usager u = new Usager();
				u.setNom(fk.name().lastName());
				u.setPrenom(fk.name().firstName());
				usagerRepository.save(u);
			}
		}

		// bind first user to first book :

		Usager u = usagerRepository.findById(1).get();
		Livre l = livreRepository.findById(1).get();
		l.setUsager(u);
		System.err.println(l.getUsager().getNom());
		// livreRepository.save(l);
		// livreRepository.save(l);

		// try {
		// Connection connection = dataSource.getConnection();
		// Statement statement = connection.createStatement();
		// // statement.execute(StringsCatalog.DROP_LIVRES);
		// // statement.execute(StringsCatalog.DROP_USAGERS);
		// //
		// // statement.executeUpdate(StringsCatalog.CREATE_BOOKS_TABLE_REQUEST);
		// // statement.executeUpdate(StringsCatalog.CREATE_USERS_TABLE_REQUEST);
		// Logger log = LoggerFactory.getLogger(DBInitializeConfig.class);
		// log.error("killroy !");
		// System.err.println("pouet");
		//
		// statement.close();
		// connection.close();
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
	}
}
