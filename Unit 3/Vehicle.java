//  Write a Java program to create a class called Vehicle with attributes for color, model, and year. 
// Create an object of the class and display its attributes

public class Vehicle {
    String color;
    String model;
    int year;


    // Constructor
    Vehicle(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }
// Method

void display(){
    System.out.println("Color: "+color);
    System.out.println("model: "+model);
    System.out.println("year: "+year);
}

public static void main(String[] args){
    Vehicle v=new Vehicle ("Red","Toyota",2025);
   v.display();
}
}