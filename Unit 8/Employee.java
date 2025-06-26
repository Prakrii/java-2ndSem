

public class Employee<T>{
    private T employeeId;
    public Employee(T employeeId){
        this.employeeId=employeeId;

    }
    public T getEmployeeId(){
        return employeeId;

    }
    public void setEmployeeId(T employeeId){
        this.employeeId=employeeId;
    }
    @Override
    public String toString(){
        return "Employee{" + "employeeId=" + employeeId + '}';
    }

    public static void main(String[] args) {
        Employee emp=new Employee(45);
        Employee emp1=new Employee("emp124");
       System.out.println("Student id in int"+ emp.getEmployeeId());
       System.out.println("Student id in string"+ emp1.getEmployeeId());
    }

}