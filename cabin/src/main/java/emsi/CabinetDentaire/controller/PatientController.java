package emsi.CabinetDentaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import emsi.CabinetDentaire.model.Patient;
import emsi.CabinetDentaire.service.PatientService;

@Controller
public class PatientController {
	@Autowired
	private PatientService patientService;
	//display list of Patients
	@GetMapping("/listPatient")
	public String viewHomePage(Model model) {
		model.addAttribute("listPatients", patientService.getAllPatients());
		return "listPatient";
	}
	
	@GetMapping("/addPatient")
	public String addPatient(Model model) {
		Patient patient = new Patient();
		model.addAttribute("patient", patient);
		return "addPatient";
	}
	@PostMapping("/savePatient")
	public String savePatient(@ModelAttribute("patient") Patient patient) {
		patientService.savePatient(patient);
		return "redirect:/";
	}
	@GetMapping("/updatePatient/{id}")
	public String updatePatient(@PathVariable (value = "id") long id, Model model) {
		Patient patient = patientService.getPatientById(id);
		
		model.addAttribute("patient", patient);
		return "updatePatient";
	}
	@GetMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable (value = "id") long id) {
		this.patientService.deletePatientById(id);
		return "redirect:/";
	}
}
