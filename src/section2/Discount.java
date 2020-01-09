package section2;

import java.util.Scanner;

class dicount {

    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println("Price of item1");
        float item1 = s.nextFloat();
        System.out.println("Price of item2");
        float item2 = s.nextFloat();
        System.out.println("Discount in percent");
        int dis = s.nextInt();
        float total = item1 + item2;
        System.out.println("Total amount $" + total);
        int amtdis = 100 - dis;
        float discount = (amtdis * total) / 100;
        System.out.println("discounted amount= $" + discount);
        float saved = total - discount;
        System.out.println("saved amount amount= $" + saved);
        s.close();

    }

}
