package Lesson5.Lessonover;

public class Motobake {
    private String name;
    private String model;
    private String color;
    private int wheel;


    Motobake(String name, String model, String color, int wheel){
        this.name = name;
        this.model = model;
        this.color = color;
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }



}
