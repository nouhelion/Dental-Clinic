package emsi.CabinetDentaire.service;

import java.util.List;

import emsi.CabinetDentaire.model.RendezVous;



public interface RendezVousService {
	List<RendezVous> getAllRendezVous();
	void saveRendezVous(RendezVous rendezVous);
	RendezVous getRendezVousById(long id);
	

}
