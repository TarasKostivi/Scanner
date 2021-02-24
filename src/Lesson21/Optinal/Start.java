package Lesson21.Optinal;

import ty.task.Person;

import java.util.List;
import java.util.Optional;

public class Start {
    public static void main(String[] args) {
        Person obj = new Person("Sffg", 22);
        Optional<Person> optPerson = Optional.ofNullable(obj);

        Person person = optPerson.filter(p -> p.getAgel() >= 18).orElse(new Person("DFD", 32));
        System.out.println(person);
    }
}
