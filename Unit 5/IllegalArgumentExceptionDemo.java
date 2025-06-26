    /* 4. Write a Java program that demonstrates the use of try, catch, finally, and throw keywords. Create a
    method that throws an IllegalArgumentException if a negative number is passed to it.
    */

    // java.io.IllegalArgumentException;

    public class IllegalArgumentExceptionDemo {
        public static void main(String[] args) {
            try{
                printArea(-5); 
            }catch(IllegalArgumentException e){
            System.out.println("Exception occurs:"+e);
            }finally{
            System.out.println( "This block always runs (Finally block)");
        }
    }
        static void printArea(int radius) {
            if (radius < 0) {
                throw new IllegalArgumentException("Number must be greater then zero");
            }
            double area = 3.14 * radius * radius;
            System.out.println("The area is:" + area);
        }
    }


        