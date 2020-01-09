package section6;

import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Payback card\n 2.Membership card");
        int c = s.nextInt();
        s.nextLine();
        PaybackCard p[] = new PaybackCard[3];
        MembershipCard m[] = new MembershipCard[3];
        if (c == 1) {
            System.out.println("Enter the card details:");
            String val[] = s.nextLine().split("\\|");
            System.out.println("Enter points in Card ");
            int pointsEarned = s.nextInt();
            System.out.println("Enter Amount");
            double totalAmount = s.nextDouble();
            for (int i = 0; i < 3; i++) {
                p[i] = new PaybackCard(val[0], val[1], val[2], pointsEarned, totalAmount);

            }
            System.out.println(val[0] + "'s Payback Card Details:");
            System.out.println("Card Number " + val[1]);
            System.out.println("Points earned " + pointsEarned);
            System.out.println("Total Amount " + totalAmount);
        }

        if (c == 2) {
            System.out.println("Enter the card details:");
            String val[] = s.nextLine().split("\\|");
            System.out.println("Enter rating in card");
            int rating = s.nextInt();
            for (int i = 0; i < 3; i++) {
                m[i] = new MembershipCard(val[0], val[1], val[2], rating);

            }
            System.out.println(val[0] + "'s Membership Card Details:");
            System.out.println("Card Number " + val[1]);
            System.out.println("rating " + rating);
        }

        s.close();

    }

}
