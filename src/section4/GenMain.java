package section4;

import java.util.Scanner;

public class GenMain {

    private static Scanner s;

    public static void main(String[] args) {

        s = new Scanner(System.in);

        GenC g = new GenC(969143, "John ");
        GenC g1 = new GenC(969144, " priya ");

        System.out.println("Enter the number of GenCs");
        int gen = Integer.parseInt(s.nextLine());

        for (int i = 0; i < gen; i++) {
            System.out.println("Enter the Employee Id");
            int empId = Integer.parseInt(s.nextLine());
            g.setEmpId(empId);

            System.out.println("Enter the name");
            String name = s.nextLine();
            g.setName(name);
        }

        g.display();
        g1.display();
        s.close();

    }

}
