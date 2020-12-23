package Lesson9;

public class Main {
    public static void main(String[] args) {

        Percon percon = new Percon("Ighor",20, "ighor@gmail.com" );
        try{
            percon.validate();
        }catch (UnderAgeEception | IncorrectEmailEception e){
            System.out.println(e.getMessage());
        }
    }
}
