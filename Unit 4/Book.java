// 1. Create a Book class with attributes title and author. Add a method displayInfo() that prints the book's title and author.



public class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    // Method
    void displayInfo(){
        System.out.println("title: "+ title);
        System.out.println("author: "+ author);
    }

    // Main Method

    public static void main(String[] args) {
        Book book=new Book("Complete Mern Stack","Prajjwol Pyakurel");
        book.displayInfo();

    }
}
