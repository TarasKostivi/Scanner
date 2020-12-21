package Lesson5;

public class car {
    private String model;
    private String color;
    private String year;
    private int dors;


    car(String model, String color, String year, int dors){
        this.model = model;
        this.color = color;
        this.year = year;
        this.dors = dors;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getDors() {
        return dors;
    }

    public void setDors(int dors) {
        this.dors = dors;
    }

    public void start(){
        System.out.println("Lets go");
    }
}
