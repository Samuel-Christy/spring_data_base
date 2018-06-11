package application.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "livres")
public class Livre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String nom_auteur;

	private String prenom_auteur;

	private String titre;

	private int annee;

	private String editeur;

	private LocalDate date_sortie;

	private LocalDate date_retour;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usager_id", nullable = true, referencedColumnName = "id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Usager usager;

	/**
	 * @return the usager
	 */
	public Usager getUsager() {
		return usager;
	}

	/**
	 * @param usager
	 *            the usager to set
	 */
	public void setUsager(Usager usager) {
		this.usager = usager;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nom_auteur
	 */
	public String getNom_auteur() {
		return nom_auteur;
	}

	/**
	 * @return the prenom_auteur
	 */
	public String getPrenom_auteur() {
		return prenom_auteur;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @return the editeur
	 */
	public String getEditeur() {
		return editeur;
	}

	/**
	 * @return the date_sortie
	 */
	public LocalDate getDate_sortie() {
		return date_sortie;
	}

	/**
	 * @return the date_retour
	 */
	public LocalDate getDate_retour() {
		return date_retour;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nom_auteur
	 *            the nom_auteur to set
	 */
	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}

	/**
	 * @param prenom_auteur
	 *            the prenom_auteur to set
	 */
	public void setPrenom_auteur(String prenom_auteur) {
		this.prenom_auteur = prenom_auteur;
	}

	/**
	 * @param titre
	 *            the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @param annee
	 *            the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/**
	 * @param editeur
	 *            the editeur to set
	 */
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	/**
	 * @param date_sortie
	 *            the date_sortie to set
	 */
	public void setDate_sortie(LocalDate date_sortie) {
		this.date_sortie = date_sortie;
	}

	/**
	 * @param date_retour
	 *            the date_retour to set
	 */
	public void setDate_retour(LocalDate date_retour) {
		this.date_retour = date_retour;
	}

}
