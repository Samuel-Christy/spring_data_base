// package application.bootstrap;
//
// import org.slf4j.Logger;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.ApplicationListener;
// import org.springframework.context.event.ContextRefreshedEvent;
// import org.springframework.stereotype.Component;
//
// import application.beans.Livre;
// import application.repositories.LivreRepository;
//
// @Component
// public class LivreLoader implements
// ApplicationListener<ContextRefreshedEvent> {
//
// private LivreRepository livreRepository;
//
// private Logger log = org.slf4j.LoggerFactory.getLogger(LivreLoader.class);
//
// @Autowired
// public void setProductRepository(LivreRepository livreRepository) {
// this.livreRepository = livreRepository;
// }
//
// @Override
// public void onApplicationEvent(ContextRefreshedEvent event) {
//
// Livre shirt = new Livre();
// shirt.setTitre("Spring Framework Guru Shirt");
// livreRepository.save(shirt);
//
// log.info("Saved Shirt - id: " + shirt.getId());
//
// }
//
// }
