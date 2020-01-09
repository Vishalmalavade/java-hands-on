package PracticeHandsOn;

import java.util.Scanner;

public class Multiplication {

    private static Scanner s;

    public static void main(String[] args) {
        System.out.println("Enter the number");
        s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
