package fr.digi.ex3;

import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore extends AnimalCollection {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;

	public ZoneCarnivore() {
		// Initialisation des listes
		this.types = new ArrayList<>();
		this.noms = new ArrayList<>();
		this.comportements = new ArrayList<>();
	}

	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		// Assurez-vous que les listes sont initialisées
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}

	public void afficherListeAnimaux() {
		for (String nom : noms) {
			System.out.println(nom);
		}
	}

	public int compterAnimaux() {
		return noms.size();
	}

	public double calculerKgsNourritureParJour() {
		return noms.size() * 10; // Ajustez la quantité de nourriture si nécessaire
	}
}
