package section5;

import java.util.Scanner;

public class ShapesMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Rectangle\n 2.Square\n 3.Circle");
        System.out.println("Area Calculator --- Choose your shape ");
        int choose = s.nextInt();
        switch (choose) {
        case 1:
            System.out.println("Enter length and breadth: ");
            int length = s.nextInt();
            int breadth = s.nextInt();
            Rectangle r = new Rectangle(length, breadth, "Rectangle");
            System.out.printf("Area of Rectangle is:%.2f", r.calculateArea());
            break;
        case 2:
            System.out.println("Enter side: ");
            int side = s.nextInt();

            Square sq = new Square(side, "Square");
            System.out.printf("Area of Square is:%.2f", sq.calculateArea());
            break;

        case 3:
            System.out.println("Enter Radius: ");
            int radius = s.nextInt();

            Circle c = new Circle(radius, "Circle");
            System.out.printf("Area of Circle is: %2f", c.calculateArea());
            break;
        default:
            System.out.println(" Choose an appropriate number");
        }
        s.close();

    }

}
