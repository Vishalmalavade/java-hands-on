package PracticeHandsOn2;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        int i, j, temp;
        Scanner sc = new Scanner(System.in);

        int array[] = new int[10];

        System.out.println("Enter " + 10 + " integers: ");

        for (i = 0; i < 10; i++)
            array[i] = sc.nextInt();

        for (i = 0; i < (10 - 1); i++) {
            for (j = 0; j < 10 - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted List is");

        for (i = 0; i < 10; i++)
            System.out.println(array[i]);
        sc.close();
    }

}
