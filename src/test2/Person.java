package test2;
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String someName;
    private int age;

    Person(){

    }

    public Person(String name, String someName, int age) {
        this.name = name;
        this.someName = someName;
        this.age = age;
    }

    public Person(String word, Integer valueOf) {
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


}

