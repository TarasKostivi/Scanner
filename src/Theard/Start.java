package Theard;

import Theard.Annotation.PeopleQeueRun;

import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        List<String> people1 = Arrays.asList("Max", "Anton", "Vlad", "Oleg");
        List<String> people2 = Arrays.asList("Olen", "Ira", "Natali", "Olz");

        PeopleQeue menQueue = new PeopleQeue(people1, 3000);
        PeopleQeue woomenQueue = new PeopleQeue(people2, 2000);
        PeopleQeue woomenQueue1 = new PeopleQeue(people2, 2000);

        Thread thread = new Thread(new PeopleQeueRun(people2, 3455));

        menQueue.run();
        woomenQueue.interrupt();
        woomenQueue.run();
        thread.start();
    }
}
