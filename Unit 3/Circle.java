
// Define a Java class called Circle with an attribute for radius. Write a method to calculate and return the area of the circle. 
// Use encapsulation to hide the implementation details.

public class Circle {
  private  double radius;

    // Constructor
    Circle(double radius){
this.radius=radius;
    }

  //  setter to set radius
public void setRadius(double radius1){
    radius=radius1;
}

// getter to get radius
public double getRadius(){
    return radius;
}

// private Method 
private double calculate(){
    return 3.14*radius*radius;
}
// getter to get method 
public double getCalculate(){
    return calculate();
}
// main method
public static void main(String[] args) {
    Circle area=new Circle(4);
   System.out.println( area.getCalculate());

}

}
