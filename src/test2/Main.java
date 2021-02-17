package test2;

import java.io.*;
class DeseralizationStart{
        public static void main(String[] args) {
            try(InputStream inputStream = new FileInputStream("C:\\Users\\Study\\IdeaProjects\\Text.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream))
            {
                Person person = (Person)objectInputStream.readObject();
                System.out.println(person.getName());
            }catch (IOException  | ClassNotFoundException e ){

            }
        }

}

