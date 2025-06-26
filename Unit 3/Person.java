

/*
 Create a Java class called Person with attributes for name, age, and address. Write a method to display the person's details
 */
public class Person {
//    Attributes
 String name;
    int age;
    String address;

    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    // Method to display:
    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("age: "+age);
    }

// Main method
public static void main(String[] args) {
    Person p=new Person("Ram",20,"KTM");
    p.display();
}

}
