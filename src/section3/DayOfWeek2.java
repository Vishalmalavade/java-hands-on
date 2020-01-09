package section3;

import java.util.Scanner;

public class DayOfWeek2 {

    private static Scanner s;

    public static void main(String[] args) {

        s = new Scanner(System.in);
        String[] a = new String[7];
        a[0] = "Sun";
        a[1] = "Mon";
        a[2] = "Tue";
        a[3] = "Wed";
        a[4] = "Thurs";
        a[5] = "Fri";
        a[6] = "Sat";
        System.out.println("Enter the day number");
        int a1 = s.nextInt();
        System.out.println("day of the week is " + a[a1 - 1]);

    }

}
