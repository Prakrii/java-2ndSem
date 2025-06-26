
/*
 6. Create an AbstractAnimal abstract class with an abstract method sound(). Then, create a Dog class that extends AbstractAnimal and provides
an implementation for the sound() method. Write a main() method that creates a Dog object and calls the sound() method.
 */


// Abstract class
abstract class AbstractAnimal {
    // Abstract method
    abstract void sound();
}

// Subclass
class Dog extends AbstractAnimal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
