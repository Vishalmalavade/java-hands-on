package PracticeHandsOn;

import java.util.Scanner;

public class Min {

    public static void main(String[] args) {
        int n, min, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        min = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Smallest value:" + min);
        max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Biggest value:" + max);
        s.close();

    }

}
