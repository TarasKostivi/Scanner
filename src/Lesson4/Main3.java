package Lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Користувач вводе : ");
        int m = scanner.nextInt();
        double n = 0.07;
        int r = 7;
        for (int i = 0; i <= r; i++) {
            System.out.println(i);
            n  += n * m / 100;
        }
        System.out.println(n);
    }
}
