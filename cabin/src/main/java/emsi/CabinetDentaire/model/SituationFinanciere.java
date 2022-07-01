package emsi.CabinetDentaire.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SituationFinancieres")
public class SituationFinanciere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSf;
	private LocalDate date;
	private double mt_paye;
	private double mt_reste;
	private double mt_total;
	
	@OneToMany
	private List<Facture> facture;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "situationfinanciere")
	private Patient patient;
	public SituationFinanciere() {
		super();
	}
	public SituationFinanciere(long idSf, LocalDate date, double mt_paye, double mt_reste, double mt_total) {
		super();
		this.idSf = idSf;
		this.date = date;
		this.mt_paye = mt_paye;
		this.mt_reste = mt_reste;
		this.mt_total = mt_total;
	}
	public long getIdSf() {
		return idSf;
	}
	public void setIdSf(long idSf) {
		this.idSf = idSf;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getMt_paye() {
		return mt_paye;
	}
	public void setMt_paye(double mt_paye) {
		this.mt_paye = mt_paye;
	}
	public double getMt_reste() {
		return mt_reste;
	}
	public void setMt_reste(double mt_reste) {
		this.mt_reste = mt_reste;
	}
	public double getMt_total() {
		return mt_total;
	}
	public void setMt_total(double mt_total) {
		this.mt_total = mt_total;
	}
}
