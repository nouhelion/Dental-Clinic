package emsi.CabinetDentaire.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Acts")
public class Act {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idA;
	private String libelle;
	private String type;
	private long prixDeBase;
	
	@OneToMany
	private List<InterventionMedecin> interventionMedecin;
	
	public Act() {
		super();
	}
	public Act(long idA, String libelle, String type, long prixDeBase) {
		super();
		this.idA = idA;
		this.libelle = libelle;
		this.type = type;
		this.prixDeBase = prixDeBase;
	}
	public long getIdA() {
		return idA;
	}
	public void setIdA(long idA) {
		this.idA = idA;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getPrixDeBase() {
		return prixDeBase;
	}
	public void setPrixDeBase(long prixDeBase) {
		this.prixDeBase = prixDeBase;
	}
	
	
}
