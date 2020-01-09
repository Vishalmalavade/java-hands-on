package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortTheScores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sample Input :");
        int num = s.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(num);
        for (int i = 0; i < num; i++) {
            list.add(s.nextInt());
        }
        Collections.sort(list);
        System.out.println("Sample Output:");
        for (int x : list)
            System.out.println(x);
        s.close();
    }
}
