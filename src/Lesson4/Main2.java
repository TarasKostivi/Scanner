package Lesson4;

public class Main2 {

    public static void main(String[] args) {
        Car car2 = new  Car("Ford", "S", 2, "green");

        car2.setColor("white");
        car2.setName("BMW");

        System.out.println(car2.getColor());
        System.out.println(car2.getName());


    }


}
