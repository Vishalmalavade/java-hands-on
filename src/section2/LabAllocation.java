package section2;

import java.util.Scanner;

class LabAllocation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter x");
        x = s.nextInt();
        System.out.println("Enter y");
        y = s.nextInt();
        System.out.println("Enter z");
        z = s.nextInt();

        s.close();
        if (x < y && x < z) {
            System.out.println("L1 has the minimal seating capacity");
        } else if (y < z && y < x) {
            System.out.println("L2 has the minimal seating capacity ");
        } else {
            System.out.println("L3 has the minimal seating capacity");
        }
    }
}
