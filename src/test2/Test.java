package test2;
import java.io.*;

public class Test {
public static void main(String[] args) {
    File file = new File("C:\\Users\\\\Study\\IdeaProjects\\Text2.txt");
    String str = "Hello World";
    try(Writer writer = new FileWriter(file);
        Reader reader = new FileReader(file);
    )
    {
        file.createNewFile();

        writer.write(str);
        String str2 = " ";

        while (reader.ready()){
            str2 += (char) reader.read();
        }
        System.out.println(str2);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
