
// Write a Java program to create a class called Employee with attributes for employeeId, name, and salary.
//Use access specifiers (public,private, protected) to restrict access to the attributes.

public class Employee {
public int EmployeeId;
private String name;
protected double salary;


// Constructor
Employee(int EmployeeId,String name, double salary){
    this.EmployeeId=EmployeeId;
    this.name=name;
    this.salary=salary;
}


// Method
public void display() {
    System.out.println(EmployeeId);
    System.out.println(name);
    System.out.println(salary);
}

public static void main(String[] args) {
    Employee emp=new Employee(20,"Ram",20000);
    emp.display();
}


}
