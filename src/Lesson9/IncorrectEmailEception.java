package Lesson9;

public class IncorrectEmailEception extends Exception {

    IncorrectEmailEception(){
        super();
    }

    IncorrectEmailEception(String massage){
        super(massage);
    }
}
