package lesson16.task;

import Lesson9.Percon;

import java.util.Comparator;

public class Person {
    private String name;
    private String someName;
    private int age;

    public Person(String name, String someName, int age) {
        if (age < 16){
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.someName = someName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class ComparatorByName implements Comparator<Person> {


        @Override
        public int compare(Person o1, Person o2) {
            int res = o1.getName().compareTo(o2.getName());
            if (res == 0){
                res = o1.getSomeName().compareTo(o2.getSomeName());
            }
            return res;
        }
    }
}

