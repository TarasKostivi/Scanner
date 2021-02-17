package lesson16;

import lesson16.task.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> persons = new HashMap<>();
        persons.put("KB4564125", new Person("Andri", "Kisel", 45));
        persons.put("KR4765125", new Person("Oleg", "Umel", 21));
        persons.put("EU4868125", new Person("Ivan", "Janko", 34));
        persons.put("EL4868145", new Person("Igor", "Jol", 23));




        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println();
            System.out.println("1. Create new person");
            System.out.println("2. Check person exists by passport ID");
            System.out.println("3. Remove person by passport ID");
            System.out.println("4. Get person by passport ID");
            System.out.println("5. Get all persons");
            System.out.println();

            int select = scanner.nextInt();


            switch (select){
                case 1:{
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter surname: ");
                    String surname = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter passport ID: ");
                    String passport = scanner.next();
                    persons.put(passport, new Person(name, surname, age));
                    break;
                }
                case 5:{
                    for (Map.Entry<String, Person> myEntry : persons.entrySet()){
                        System.out.println(myEntry.getKey() + " - " + myEntry.getValue().getName());
                    }
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
        }

    }
}
