package section2;

import java.util.Scanner;

class ProfitLoss {

    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased ");
        s.nextDouble();
        System.out.println("Enter the price per dozen ");
        double y = s.nextDouble();
        System.out.println("Enter the Selling price of per toy ");
        double z = s.nextDouble();
        double cp = y / 12;
        double profit = (z - cp);
        double percent = (profit / cp) * 100;
        System.out.println("Sam's profit percentage is" + percent + "percent");
        s.close();

    }
}
