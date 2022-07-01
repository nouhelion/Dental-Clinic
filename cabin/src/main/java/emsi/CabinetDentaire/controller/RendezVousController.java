package emsi.CabinetDentaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import emsi.CabinetDentaire.model.RendezVous;
import emsi.CabinetDentaire.service.RendezVousService;

@Controller
public class RendezVousController {
	
	@Autowired
	private RendezVousService rendezVousService;

	@GetMapping("/listRdv/{id}")
	public String viewRdvPage(@PathVariable (value = "id") long id,Model model) {
		model.addAttribute("listRendezVous", rendezVousService.getRendezVousById(id));
		return "listRdv";
	}
	
	@GetMapping("/addRdv")
	public String addRdv(Model model) {
		RendezVous rendezVous = new RendezVous();
		model.addAttribute("rendezVous", rendezVous);
		return "addRdv";
	}
	@PostMapping("/saveRdv")
	public String saveRdv(@ModelAttribute("rendezVous") RendezVous rendezVous) {
		rendezVousService.saveRendezVous(rendezVous);
		return "redirect:/listRdv/{id}(id=${patient.id})";
	}
	
}
