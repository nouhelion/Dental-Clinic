package emsi.CabinetDentaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emsi.CabinetDentaire.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
