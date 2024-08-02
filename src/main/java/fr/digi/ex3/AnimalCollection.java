package fr.digi.ex3;


import java.util.ArrayList;
import java.util.List; /**
 * La classe {@code AnimalCollection} représente une collection générique d'animaux.
 * Elle fournit des méthodes pour ajouter des animaux, afficher la liste des noms et calculer la quantité de nourriture.
 */
public class AnimalCollection {

    protected List<String> types;
    protected List<String> noms;
    protected List<String> comportements;

    /**
     * Constructeur par défaut pour initialiser les listes d'animaux.
     */
    public AnimalCollection() {
        this.types = new ArrayList<>();
        this.noms = new ArrayList<>();
        this.comportements = new ArrayList<>();
    }

    /**
     * Ajoute un animal à la collection.
     *
     * @param typeAnimal le type de l'animal
     * @param nomAnimal le nom de l'animal
     * @param comportement le comportement de l'animal
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /**
     * Affiche la liste des noms des animaux.
     */
    public void afficherListeAnimaux() {
        for (String nom : noms) {
            System.out.println(nom);
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour en fonction du nombre d'animaux.
     *
     * @return la quantité de nourriture nécessaire par jour en kilogrammes
     */
    public double calculerKgsNourritureParJour() {
        return noms.size() * 0.2;
    }
}




