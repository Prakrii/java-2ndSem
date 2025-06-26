

// Generic class that can hold any type of animal (or subclass of Animal)
// Demonstrates use of Generics combined with polymorphism
class AnimalBox<T extends Animal> {
    private T animal; // Holds an instance of a specific type of Animal

    // Setter method to assign an animal to the box
    public void setAnimal(T animal){
        this.animal=animal;
    }

    // Getter method to retrieve the animal from the box
    public T getAnimal(){
        return animal;

    }

    // Calls the speak method of the contained animal instance
    // This is a polymorphic call - the actual method executed depends on the runtime type of 'animal'
    public void makeSound(){
        animal.speak();
    }



}


