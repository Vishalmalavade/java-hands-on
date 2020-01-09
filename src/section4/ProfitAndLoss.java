package section4;

import java.util.Scanner;

public class ProfitAndLoss {

    static int dozenCount;
    static int pricePerDozen;
    static int sellPrice;
    static float profitPercentage;
    static int x;
    static int y;
    static float z;
    static float profit;
    static float cp;
    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased");
        x = s.nextInt();
        System.out.println("Enter price per dozen");
        y = s.nextInt();
        System.out.println("Enter selling price");
        z = s.nextFloat();
        calculateProfit();
        System.out.println("sam has" + profitPercentage);
    }

    public static float calculateProfit() {
        cp = (y / 12);
        profit = (z - cp);
        profitPercentage = (profit / cp) * 100;
        return profitPercentage;
    }

    public float calculateProfit1(int dozenCount, int pricePerDozen, int sellPrice) {
        ProfitAndLoss.dozenCount = dozenCount;
        ProfitAndLoss.pricePerDozen = pricePerDozen;
        ProfitAndLoss.sellPrice = sellPrice;
        return profitPercentage;

    }
}
