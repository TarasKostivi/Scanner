import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        System.out.println("Enter first number");
        first = scanner.nextInt();

        if (first >= 20 && first < 27){
            System.out.println("You can do compulsory or contract service");
        }else if(first >= 27 && first < 40){
            System.out.println("You can only serve by contracthjk");
        }else if (first >= 40 && first < 50){
            System.out.println("You can only serve by contract but you have rghisk");
        }else if (first >= 60 && first < 100){
            System.out.println("Most likely, you made a mistake and entered your age incorrectly.");
        }else {
            System.out.println("");
        }
    }
}
