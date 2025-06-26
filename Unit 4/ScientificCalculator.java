
/* 
 
5. Create a Calculator class with a method add(int x, int y) that adds two numbers. Then, create a ScientificCalculator class that inherits from
Calculator and overrides the add() method to perform multiplication instead of addition. Write a main() method that creates a
ScientificCalculator object and calls the add() method.


 */

class Calculator {

    // Method
    double add(int x, int y) {
        return x + y;
    }

}

// Sub class

public class ScientificCalculator extends Calculator {

    @Override
    double add(int x, int y) {

        return x * y;
    }

    // Main method

    public static void main(String[] args) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(scientificCalculator.add(5, 2));
    }

}

// OutPut: 10