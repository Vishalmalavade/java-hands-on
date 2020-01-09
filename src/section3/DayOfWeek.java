package section3;

import java.util.Scanner;

public class DayOfWeek {

    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        String a[] = { "Sat", "Sun", "Mon", "Tue", "Wed", "Thurs", "Fri" };
        System.out.println("Enter the day number");
        int a1 = s.nextInt();
        System.out.println("Day of the week is " + a[a1]);
    }

}
