package section2;

import java.util.Scanner;

class Comapre {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        System.out.println("Enter first number");
        x = s.nextInt();
        System.out.println("Enter second number");
        y = s.nextInt();

        s.close();
        if (x < y) {
            System.out.println(+x + " is less than " + y);
        }
        if (x > y) {
            System.out.println(+x + " is greater than " + y);
        }
        if (x == y) {
            System.out.println(+y + " is equal to " + x);
        }
    }
}
