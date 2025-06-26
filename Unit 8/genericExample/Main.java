


public class Main {
    public static void main(String[] args) {
        
        // Create an AnimalBox that specifically holds Dog objects
        AnimalBox<Dog> dogBox = new AnimalBox<>();
        dogBox.setAnimal(new Dog()); //Put a Dog into the box
        dogBox.makeSound();

        // Create an AnimalBox that specifically holds Cat objects
        AnimalBox<Cat> catBox= new AnimalBox<>();
        catBox.setAnimal(new Cat()); // Put a Cat into the box
        catBox.makeSound();

    }
}
