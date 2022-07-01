package emsi.CabinetDentaire.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Consultations")
public class Consultation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCons;
	private LocalDate date;
	private String noteMed;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "consultation")
	private RendezVous rendezvous;
	
	@ManyToOne
	private InterventionMedecin interventionMedecin;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "consultation")
	private Facture facture;
	
	public Consultation() {
		super();
	}

	public Consultation(long idCons, LocalDate date, String noteMed) {
		super();
		this.idCons = idCons;
		this.date = date;
		this.noteMed = noteMed;
	}

	public long getIdCons() {
		return idCons;
	}

	public void setIdCons(long idCons) {
		this.idCons = idCons;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getNoteMed() {
		return noteMed;
	}

	public void setNoteMed(String noteMed) {
		this.noteMed = noteMed;
	}
	public RendezVous getRdv() {
		return rendezvous;
	}
	public void setRdv(RendezVous rendezvous) {
		this.rendezvous = rendezvous;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public InterventionMedecin getInterventionMedecin() {
		return interventionMedecin;
	}
	public void setInterventionMedecin(InterventionMedecin interventionMedecin) {
		this.interventionMedecin = interventionMedecin;
	}
}
