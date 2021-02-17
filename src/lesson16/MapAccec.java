package lesson16;

import lesson16.task.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAccec {
    public static void main(String[] args) {
        Map<Person, Accaunt> accauntMap = new HashMap<>();

        accauntMap.put(new Person("Andrii", "soda", 12), new Accaunt("Andrii@gmail.com", 2123));
        accauntMap.put(new Person("Illa", "Olv", 22), new Accaunt("IllaOlv@gmail.com", 3457));
        accauntMap.put(new Person("Evgen", "Olvin", 21), new Accaunt("EvgenOlvin@gmail.com", 3467));

        Scanner scanner = new Scanner(System.in);


    }
}
