package birdsanctuary;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to bird Sanctuary");

		BirdSanctuaryManager BirdSanctuaryManager = new BirdSanctuaryManager();

		Duck duck = new Duck();
		Duck duck2 = new Duck();
		Parrot parrot = new Parrot();
		Penguin penguin = new Penguin();

		BirdSanctuaryManager.add(parrot);
		BirdSanctuaryManager.add(duck);
		BirdSanctuaryManager.add(duck2);
		BirdSanctuaryManager.add(penguin);

		BirdSanctuaryManager.printEatingBirds();
		BirdSanctuaryManager.printFlyableBirds();
		BirdSanctuaryManager.printSwimmableBirds();

		BirdSanctuaryManager.remove(parrot);
		BirdSanctuaryManager.remove(duck);

		System.out.println("Duck Count: " + Duck.count);
		System.out.println("Parrot Count: " + Parrot.count);
		System.out.println("Penguin Count: " + Penguin.count);

	
	}	
}


