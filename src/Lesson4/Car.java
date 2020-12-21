package Lesson4;

public class Car {
    private String name;
    private String model;
    private int age;
    private String color;


    Car(String name, String model, int age, String color){
        this.name = name;
        this.model = model;
        this.age = age;
        this.color = color;
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void toGo(){
        if (model != null && model.equalsIgnoreCase("M") ){
            System.out.println("Gold");
        }else {
            System.out.println("Silver");
        }
    }
}


