package Lesson21;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Person<Integer>> people = new ArrayList<>();
        people.add(new Person<>("Taras", 22));
        people.add(new Person<>("Ivan", 12));
        people.add(new Person<>("Kiril", 32));
        people.add(new Person<>("Panas", 52));

        // більшити всім вік на 5 років
        people.stream().peek(person -> person.setAge(person.getAge() + 5)).forEach(System.out::println);
        people.stream().peek(person -> person.setName(person.getName().toUpperCase())).forEach(System.out::println);

        System.out.println("List: ");
        people.forEach(System.out::println);
    }
}
