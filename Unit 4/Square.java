// 2. Create a Square class that inherits from a Shape class. Add an attribute sideLength and a method calculateArea() that returns the area of the
// square

// Parent class - shape
 class Shape {
    
}

// Child Class
public class Square extends Shape{
    double sideLength;



    // Constructor

    Square(double sideLength){
        this.sideLength=sideLength;
    }

    // Method

    double calculateArea(){
        return sideLength*sideLength;
    }

    public static void main(String[] args) {
        Square square=new Square(5.35);
        System.out.println(square.calculateArea());
    }

}
