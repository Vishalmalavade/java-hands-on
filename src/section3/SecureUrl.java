package section3;

import java.util.Scanner;

class SecureUrl {

    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println("Enter the String");
        String website = s.nextLine();
        System.out.println("Enter the start string");
        String website1 = s.nextLine();
        if (website.startsWith("https") && website1.matches("[h][t]{2}[p][s]")) {
            System.out.println(website + " starts with\"https\"");

        } else {
            System.out.println(website + " does not start with\"https\"");

        }

    }
}
