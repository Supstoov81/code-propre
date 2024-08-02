package fr.digi.ex1;

import java.util.Date;

/**
 * Représente une entreprise avec des informations de base telles que
 * le numéro SIRET, le nom, l'adresse et la date de création.
 */
public class Entreprise {

	/**
	 * Le numéro SIRET de l'entreprise.
	 */
	public int siret;

	/**
	 * Le nom de l'entreprise.
	 */
	public String nom;

	/**
	 * L'adresse de l'entreprise.
	 */
	public String adresse;

	/**
	 * La date de création de l'entreprise.
	 */
	public Date dateCreation;

	/**
	 * Le capital maximum autorisé pour l'entreprise.
	 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise.
	 * Cette méthode est actuellement vide et doit être implémentée
	 * pour afficher des informations pertinentes sur l'entreprise.
	 */
	public void afficher_statut() {
		// Implementation à ajouter
	}
}