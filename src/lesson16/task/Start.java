package lesson16.task;

import Lesson9.Percon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Max", "Clap", 33));
        personList.add(new Person("Illa", "Clapl", 34));
        personList.add(new Person("Col", "Sop", 20));
        personList.add(new Person("Tren", "Klap", 35));
        personList.add(new Person("Fax", "Alap", 31));
        personList.add(new Person("Max", "Clap", 38));

        print(personList);

//        По імені використовувати внутрішній клас
        Person.ComparatorByName comparator1 = personList.get(0).new ComparatorByName();
        Collections.sort(personList, comparator1);
        print(personList);

        // По віку використовуючи внутрішній локальний клас.
        class ComparatorByAge implements Comparator<Person> {
            @Override
            public int compare(Person o1, Person o2) {
               if (o1.getAge() > o2.getAge()){
                   return 1;
               }else if(o1.getAge() < o2.getAge()){
                   return -1;
               }else {
                   return 0;
               }
            }
        }
        ComparatorByAge comparator2 = new ComparatorByAge();
        Collections.sort(personList, comparator2);
        print(personList);
    }
    // По імені і віку використовуючи внутрішній анонімний клас

    private static  void print(List<Person> list){
        for (Person percon : list) {
            System.out.println(percon.getName() + " " + percon.getSomeName() +  " " + percon.getAge());
        }
        System.out.println();
    }
}
