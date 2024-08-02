package fr.digi.ex3;

import jdk.internal.org.jline.terminal.TerminalBuilder;

public class ZooApplication extends AnimalCollection {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Zèbre", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Lion", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal("Requin blanc", "POISSON", "CARNIVORE"); // Correction pour correspondre aux types valides
		zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
		zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		zoo.addAnimal("Python", "SERPENT", "CARNIVORE");
	}


}