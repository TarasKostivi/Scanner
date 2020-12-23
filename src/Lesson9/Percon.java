package Lesson9;

import java.io.IOException;

public class Percon {


    private String name;
    private int age;
    private String email;


    public Percon(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void validate() throws UnderAgeEception, IncorrectEmailEception {
        if (this.age < 18){
            throw new UnderAgeEception("Неповнолітній");
        }else if (this.email.contains("@")){
            throw  new IncorrectEmailEception("False");
        }
    }
}
