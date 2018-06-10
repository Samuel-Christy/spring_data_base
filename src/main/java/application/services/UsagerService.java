package application.services;

import application.beans.Usager;

public interface UsagerService {

	Iterable<Usager> listAllUsagers();

	Usager getUsagerById(Integer id);

	Usager saveUsager(Usager usager);
}
