

/*
 3. Create a Fruit class with an attribute color. Then, create an Apple class that inherits from Fruit and adds an attribute taste. Write a method
displayInfo() in the Apple class that prints the apple's color and taste.
 */


//  Parent class 
 class Fruit {
    String color;

// Constructor 
Fruit(String color){
  this.color=color;
}

}

// Child class
  public class Apple extends Fruit {
 
    String taste;

    // Constructor
    Apple(String color, String taste){
      super(color);
      this.taste=taste;
    }

    // method 
    void displayInfo(){
  System.out.println("Apples Color:" + color);
  System.out.println("Apples taste:" + taste);
    }

    // Main method
    public static void main(String[] args) {
      Apple apple=new Apple("Red","Sweet" );
      apple.displayInfo();

    }
    


    
 }


