package ty.task;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mark", 12);
        Person person2 = new Person("Sark", 32);
        Person person3 = new Person("Oark", 42);
        Person person4 = new Person("Park", 52);
        Person person5 = new Person("Fark", 62);
        Person person6 = new Person("Kark", 72);

        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6));
        List<Person> aduLst = new ArrayList<>();


        people.forEach(person -> {
            if (person.getAgel() >= 18){
                aduLst.add(person);
            }
        });

        aduLst.forEach(System.out::println);

        people.forEach(person -> {
            person.setTimestamp(Instant.now());
        });
        aduLst.forEach(System.out::println);
    }

}
