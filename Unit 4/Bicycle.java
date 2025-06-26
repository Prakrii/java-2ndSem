 /*
4.  Create a Vehicle class with an attribute speed. Then, create a Bicycle class that inherits from Vehicle and adds an attribute gears. Write a
method displayInfo() in the Bicycle class that prints the bicycle's speed and number of gears
  */
 
 
 class Vehicle {
    double speed;

    // Constructor
    Vehicle (double speed){
        this.speed=speed;
    }
}

public class  Bicycle extends Vehicle {
 int gears;

   // Constructor
    Bicycle (double speed,int gears){
        super(speed);
        this.gears=gears;
    }  

    // Method
    void displayInfo(){
        System.out.println("Bicycle Speed: "+speed);
        System.out.println("Number of Gears: "+ gears);
    }


    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle(25.4,7);
        bicycle.displayInfo();
    }

}


