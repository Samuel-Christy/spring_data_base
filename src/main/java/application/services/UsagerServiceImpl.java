package application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.beans.Usager;
import application.repositories.UsagerRepository;

@Service
public class UsagerServiceImpl implements UsagerService {

	@SuppressWarnings("unused")
	private UsagerRepository usagerRepository;

	/**
	 * @param usagerRepository
	 *            the usagerRepository to set
	 */
	@Autowired
	public void setUsagerRepository(UsagerRepository usagerRepository) {
		this.usagerRepository = usagerRepository;
	}

	@Override
	public Iterable<Usager> listAllUsagers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usager getUsagerById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usager saveUsager(Usager usager) {
		// TODO Auto-generated method stub
		return null;
	}

}
