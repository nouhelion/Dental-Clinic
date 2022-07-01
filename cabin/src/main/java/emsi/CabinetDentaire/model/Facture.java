package emsi.CabinetDentaire.model;

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
@Table(name = "Factures")
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idFacture;
	private long montant;

	@ManyToOne
	private SituationFinanciere situationfinanciere;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_fa_cons")
	private Consultation consultation;
	
	public Facture() {
		super();
	}
	public Facture(long idFacture, long montant) {
		super();
		this.idFacture = idFacture;
		this.montant = montant;
	}
	public long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}
	public long getMontant() {
		return montant;
	}
	public void setMontant(long montant) {
		this.montant = montant;
	}
	
	
}
