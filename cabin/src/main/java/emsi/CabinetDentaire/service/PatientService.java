package emsi.CabinetDentaire.service;

import java.util.List;

import emsi.CabinetDentaire.model.Patient;

public interface PatientService {
	List<Patient> getAllPatients();
	void savePatient(Patient patient);
	Patient getPatientById(long id);
	void deletePatientById(long id);
}
