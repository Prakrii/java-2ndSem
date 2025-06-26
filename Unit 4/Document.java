// 8. Create a Printable interface with a method print(). Then, create a Document class that implements the Printable interface and provides an
// implementation for the print() method. Write a main() method that creates a Document object and calls the print() method.



// Interface
interface Printable {
    void print();   
}

// Document class implementing Printable interface
class Document implements Printable {
    private String content;

    // Constructor
    Document(String content) {
        this.content = content;
    }

    // Implementation of print() method
    @Override
    public void print() {
        System.out.println("Printing document: " + content);
    }
}

// Main class
 class Main {
    public static void main(String[] args) {
        Document doc = new Document("Hello, this is a sample document.");
        doc.print();
    }
}

// output 
// Printing document: Hello, this is a sample document.
