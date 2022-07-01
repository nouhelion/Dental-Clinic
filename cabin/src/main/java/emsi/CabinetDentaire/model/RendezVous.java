package emsi.CabinetDentaire.model;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name =  "RendezVous")
public class RendezVous {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;	
	
	private LocalDate dateRdv;
	private LocalTime heureRdv;
	private String motif;
	private String etat="en cours";
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_rdv_cons")
	private Consultation consultation;
	
	@ManyToOne
	private Patient patient;
	
	public RendezVous() {
		super();
	}
	public RendezVous(Long idRdv, LocalDate dateRdv, LocalTime heureRdv, String motif, String etat) {
		super();
		this.id = idRdv;
		this.dateRdv = dateRdv;
		this.heureRdv = heureRdv;
		this.motif = motif;
		this.etat = etat;
	}
	public Long getIdRdv() {
		return id;
	}
	public void setIdRdv(Long idRdv) {
		this.id = idRdv;
	}
	public LocalDate getDateRdv() {
		return dateRdv;
	}
	public void setDateRdv(LocalDate dateRdv) {
		this.dateRdv = dateRdv;
	}
	public LocalTime getHeureRdv() {
		return heureRdv;
	}
	public void setHeureRdv(LocalTime heureRdv) {
		this.heureRdv = heureRdv;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}

}
