package fr.digi.ex3;

public class Zoo extends AnimalCollection {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	public Zoo(String nom) {
		this.nom = nom;
		// Initialisation des objets
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
	}

	public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")) {
			if (zoneCarnivore == null) {
				throw new IllegalStateException("ZoneCarnivore n'est pas initialisée.");
			}
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		} else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")) {
			if (savaneAfricaine == null) {
				throw new IllegalStateException("SavaneAfricaine n'est pas initialisée.");
			}
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		} else if (typeAnimal.equals("REPTILE") || typeAnimal.equals("SERPENT")) {
			if (fermeReptile == null) {
				throw new IllegalStateException("FermeReptile n'est pas initialisée.");
			}
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		} else if (typeAnimal.equals("POISSON")) {
			if (aquarium == null) {
				throw new IllegalStateException("Aquarium n'est pas initialisé.");
			}
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		} else {
			throw new IllegalArgumentException("Type ou comportement d'animal non valide.");
		}
	}

	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
