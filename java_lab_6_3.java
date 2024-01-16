// Abstract class Bird
abstract class Bird {
    // Abstract method to represent flying behavior
    abstract void fly();

    // Abstract method to represent making a sound
    abstract void makeSound();
}

// Subclass Eagle
class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }

    @Override
    void makeSound() {
        System.out.println("Eagle makes a screeching sound.");
    }
}

// Subclass Hawk
class Hawk extends Bird {
    @Override
    void fly() {
        System.out.println("Hawk is gliding gracefully through the air.");
    }

    @Override
    void makeSound() {
        System.out.println("Hawk makes a sharp cry.");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        // Creating objects of Eagle and Hawk
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        // Performing actions specific to each bird
        System.out.println("Eagle Actions:");
        eagle.fly();
        eagle.makeSound();

        System.out.println("\nHawk Actions:");
        hawk.fly();
        hawk.makeSound();
    }
}

/*
 * Eagle Actions:
 * Eagle is soaring high in the sky.
 * Eagle makes a screeching sound.
 * 
 * Hawk Actions:
 * Hawk is gliding gracefully through the air.
 * Hawk makes a sharp cry.
 * 
 */