package emsi.CabinetDentaire.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emsi.CabinetDentaire.model.RendezVous;
import emsi.CabinetDentaire.repository.RendezVousRepository;

@Service
public class RendezVousServiceImpl implements RendezVousService{
	@Autowired
	private RendezVousRepository rendezVousRepository;
	
	@Override
	public List<RendezVous> getAllRendezVous() {
		return rendezVousRepository.findAll();
	}

	@Override
	public void saveRendezVous(RendezVous rendezVous) {
		this.rendezVousRepository.save(rendezVous);
		
	}

	@Override
	public RendezVous getRendezVousById(long id) {
		Optional<RendezVous> optional = rendezVousRepository.findById(id);
		RendezVous rendezVous = null;
		if(optional.isPresent()) {
			rendezVous = optional.get();
		}else {
			throw new RuntimeException(" Rendez-vous not found for id :: " + id);
		}
		return rendezVous;
	}

}
