
/*
7. Create an AbstractShape abstract class with an abstract calculatePerimeter() method. Create a Rectangle class that extends AbstractShape
and provides an implementation for calculatePerimeter(). Write a main() method to create a Rectangle object and call calculatePerimeter().

*/

// Abstract class
abstract class AbstractShape {
    abstract double calculatePerimeter();
}

// Rectangle class (public)
public class Rectangle extends AbstractShape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class (non-public)
class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}

// output   
// Perimeter of rectangle: 16.0