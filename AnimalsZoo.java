import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class Animal {
    private String name;
    private int age;
    private String species;

    // Constructor
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

class Hyena extends Animal {
    private boolean hasMane;

    // Constructor
    public Hyena(String name, int age, boolean hasMane) {
        super(name, age, "Hyena");
        this.hasMane = hasMane;
    }

    // Unique feature getter
    public boolean hasMane() {
        return hasMane;
    }
}

class Lion extends Animal {
    private int roarVolume;

    // Constructor
    public Lion(String name, int age, int roarVolume) {
        super(name, age, "Lion");
        this.roarVolume = roarVolume;
    }

    // Unique feature getter
    public int getRoarVolume() {
        return roarVolume;
    }
}

class Tiger extends Animal {
    private String stripePattern;

    // Constructor
    public Tiger(String name, int age, String stripePattern) {
        super(name, age, "Tiger");
        this.stripePattern = stripePattern;
    }

    // Unique feature getter
    public String getStripePattern() {
        return stripePattern;
    }
}

class Bear extends Animal {
    private boolean hibernates;

    // Constructor
    public Bear(String name, int age, boolean hibernates) {
        super(name, age, "Bear");
        this.hibernates = hibernates;
    }

    // Unique feature getter
    public boolean hibernates() {
        return hibernates;
    }
}

public class Animals {
    public static void main(String[] args) {
        // ArrayList to store animal instances
        ArrayList<Animal> animals = new ArrayList<>();

        // HashMap for counting species
        HashMap<String, Integer> speciesCount = new HashMap<>();

        // Creating instances of each animal subclass
        Hyena hyena1 = new Hyena("Spike (likes to laugh)", 3, true);
        Hyena hyena2 = new Hyena("Giggles (likes to laugh a lot)", 8, true);
        Hyena hyena3 = new Hyena("Snarls (likes to catch fish, birds, and bugs in lakes)", 5, false);
        Lion lion1 = new Lion("Fang (likes to hunt)", 5, 80);
        Lion lion2 = new Lion("Zeus (likes to hunt in small groups)", 7, 90);
        Lion lion3 = new Lion("Tumo (likes to hunt solo)", 10, 100);
        Tiger tiger1 = new Tiger("Felix (is very protective)", 4, "Striped");
        Tiger tiger2 = new Tiger("Priya (likes to swim)", 10,"Swimmers");
        Bear bear1 = new Bear("Fluffy (likes to hibernate)", 6, true);
        Bear bear2 = new Bear("Berno (likes to eat and sleep)", 9, false);

        // Adding animals to the ArrayList
        animals.add(hyena1);
        animals.add(hyena2);
        animals.add(hyena3);
        animals.add(lion1);
        animals.add(lion2);
        animals.add(lion3);
        animals.add(tiger1);
        animals.add(tiger2);
        animals.add(bear1);
        animals.add(bear2);

        // Sorting animals based on name
        Collections.sort(animals, Comparator.comparing(Animal::getName));

        // Displaying sorted animals
        System.out.println("\n" + "Sorted Zoo Animals List:");
        for (Animal animal : animals) {
            System.out.println("\n" + "[Species]: " + animal.getSpecies() + " - My name: " + animal.getName() + ", My Age = " + animal.getAge());
        }

        // Counting the occurrences of each species
        for (Animal animal : animals) {
            String species = animal.getSpecies();
            speciesCount.put(species, speciesCount.getOrDefault(species, 0 ) + 1 );
        }

        // Displaying species count
        System.out.println("\n\n" + "Animal species number count: " + speciesCount);
    }
}
