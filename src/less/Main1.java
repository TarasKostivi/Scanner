package less;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number:");
        int number = scanner.nextInt();

        int sum = 0;

        for (; number >= 0; number--)
        {
            sum+=number;
        }
        System.out.println(sum);
    }

}
//        for(int i = 0; i < 90; i += 5){
//            System.out.println(i);
//        }
//        int number = 90;
//
//        while(number > 0){
//            System.out.println(number + " ");
//            number -= 5;
//        }