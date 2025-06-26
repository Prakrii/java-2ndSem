// Create a Java class called Student with attributes for studentId, name, and grades. 
// Write a method to calculate and return the average grade.
public class Student {
    public int studentId;
    public String name;
    private double[] grades;

    // Constructor
    Student(int studentId, String name, double[] grades) {
        this.studentId = studentId;
        this.name = name;
        this.grades = grades;
    }

    // Setter for grades
    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    // Getter for grades
    public double[] getGrades() {
        return grades;
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }
}
