

    /* 

    9. Create a Comparable interface with a compareTo() method. Create a Student class that implements Comparable and provides an
    implementation for compareTo(). Write a main() method to create a Student object and call compareTo().

    */


    // Comparable interface
    interface Comparable {
        int compareTo(Student other);
    }

    // Student class implementing Comparable
    class Student implements Comparable {
        int marks;

        Student(int marks) {
            this.marks = marks;
        }

        public int compareTo(Student other) {
            return this.marks - other.marks;
        }
    }

    // Main class
    class Main {
        public static void main(String[] args) {
            Student s1 = new Student(75);
            Student s2 = new Student(85);

            int result = s1.compareTo(s2);
            System.out.println("Comparison result: " + result);
        }
    }


    /*
    Output:
    Comparison result: -10
    */