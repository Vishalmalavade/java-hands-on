package section8;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your age");
        int a = s.nextInt();
        try {
            if (a >= 18) {
                System.out.println("Welcome to vote");

            } else {
                throw new InvalidAgeException();
            }
        } catch (InvalidAgeException e) {
            System.out.println(e);

        } finally {

            s.close();
        }
    }
}
