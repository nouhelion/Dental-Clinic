package emsi.CabinetDentaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emsi.CabinetDentaire.model.RendezVous;


@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long>{

	
	
}
