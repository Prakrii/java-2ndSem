/*
 * Define a Java class called Rectangle with attributes for length and width. 
 * Write a method to calculate and return the area of the rectangle.
 */
public class Rectangle {
    // Attributes
    double length;
    double width;

    // Constructor
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

// Method to calculate and return
double CalculateArea(){
    return length*width;
}

// Main method
public static void main(String[] args){
    Rectangle rect=new Rectangle(20.4,30);
   System.out.println( "Area of Rectangle: "+rect.CalculateArea());
}

}
