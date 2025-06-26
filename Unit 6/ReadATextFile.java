
/* Write a Java program to read a text file named input.txt using FileReader and
print its content to the console.
 */
import java.io.FileReader;
import java.io.IOException;

public class ReadATextFile {
    
public static void main(String[] args) {

    try{
    FileReader file = new FileReader("input.txt");
   // System.out.println(file); // yesto garda chahi object print hunxa but we need content so,
   int content;
   while((content=file.read())!=-1){
    System.out.print((char)content);
   }
    file.close();
    }catch(IOException e){
        System.out.println("Exception occurs: "+e);
    }

}

}
