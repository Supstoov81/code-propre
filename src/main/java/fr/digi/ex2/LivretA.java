package fr.digi.ex2;

/**
 * La classe {@code LivretA} représente un compte bancaire de type Livret A.
 * Elle hérite de la classe {@code CompteBancaire}.
 * Un Livret A a un type, un solde initial, et un taux de rémunération.
 * La limite de découvert est fixée à zéro par défaut.
 */

public class LivretA extends CompteBancaire {

	/**
	 * Constructeur pour créer une instance de {@code LivretA} avec un type, un solde initial et un taux de rémunération.
	 *
	 * @param type le type de compte (doit être "LA" pour Livret A)
	 * @param solde le solde initial du compte
	 * @param tauxRemuneration le taux de rémunération du compte
	 */

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0, tauxRemuneration);
	}

}
