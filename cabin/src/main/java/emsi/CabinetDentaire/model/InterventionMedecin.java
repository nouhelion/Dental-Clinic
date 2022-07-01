package emsi.CabinetDentaire.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "InterventionMedecins")
public class InterventionMedecin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idI;
	private long prixPatient;
	private long numDent;
	
	@ManyToOne
	private Act act;
	
	@OneToMany
	private List<Consultation> consultation;
	
	public InterventionMedecin() {
		super();
	}
	public InterventionMedecin(long idI, long prixPatient, long numDent) {
		super();
		this.idI = idI;
		this.prixPatient = prixPatient;
		this.numDent = numDent;
	}
	public long getIdI() {
		return idI;
	}
	public void setIdI(long idI) {
		this.idI = idI;
	}
	public long getPrixPatient() {
		return prixPatient;
	}
	public void setPrixPatient(long prixPatient) {
		this.prixPatient = prixPatient;
	}
	public long getNumDent() {
		return numDent;
	}
	public void setNumDent(long numDent) {
		this.numDent = numDent;
	}
	
	
	
	
}
