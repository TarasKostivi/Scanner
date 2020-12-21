package Lesson4;

import java.util.Scanner;

public class jomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text:");
        String string1 = scanner.nextLine();
        System.out.print("Enter second text:");
        String string2 = scanner.nextLine();
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(string1.toUpperCase());
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(string2.toUpperCase());
            }
        }
    }
}
