package ty;
import java.io.*;

public class Main {
public static void main(String[] args) {
    try {
        Person person = new Person("Max", 30);
        OutputStream outputStream = new FileOutputStream("C:\\Users\\Study\\IdeaProjects\\Text.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(person);
        outputStream.close();

    } catch (IOException e){
        e.printStackTrace();
   }

   File file = new File("C:\\Users\\Study\\IdeaProjects\\Text.txt");

}
}
