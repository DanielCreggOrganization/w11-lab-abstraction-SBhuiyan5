package ie.atu.testpackage.abstraction;

public class Main {
    public static void main(String[] args) {
        // Create some animals
        Dog spot = new Dog("Spot", 3);
        Cat whiskers = new Cat("Whiskers", 2);
        
        // Make them introduce themselves and make sounds
        spot.introduce();      // Prints: I am Spot and I am 3 years old
        spot.makeSound();      // Prints: Woof! Woof!
        
        whiskers.introduce();  // Prints: I am Whiskers and I am 2 years old
        whiskers.makeSound();  // Prints: Meow!
    }
}