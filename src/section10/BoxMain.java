package section10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxMain {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double height = 0;
        Scanner sc = new Scanner(System.in);
        Set<Box> set = new HashSet<Box>();
        System.out.println("Enter the number of Box ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enterthe Box Detail %d \n", i + 1);
            System.out.println("Enter Length");
            length = sc.nextDouble();
            System.out.println("Enter Width");
            width = sc.nextDouble();
            System.out.println("Enter Height");
            height = sc.nextDouble();
            Box call = new Box(length, width, height);
            call.setVolume(length, width, height);
            set.add(call);
        }
        System.out.println("Unique Boxes in the Set are");
        for (Box box : set) {
            System.out.println(box.toString());
        }
        sc.close();
    }
}
