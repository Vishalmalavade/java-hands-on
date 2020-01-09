package PracticeHandsOn2;

import java.util.Scanner;

public class IncomeTax2 {

    public static void main(String[] args) {
        float taxAmount = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Annual Salary");
        int salary = s.nextInt();
        if (salary >= 0 && salary <= 300000) {
            System.out.println("TaxAmount " + taxAmount);
        } else if (salary > 300001 && salary <= 500000) {
            taxAmount = (((salary - 300000) * 5) / 100);
            System.out.println("TaxAmount " + taxAmount);
        } else if (salary >= 500001 && salary <= 1000000) {
            taxAmount = (((salary - 500000) * 20) / 100) + 12500;
            System.out.println("TaxAmount " + taxAmount);
        } else {
            taxAmount = (((salary - 1000000) * 30) / 100) + 12500 + 100000;
            System.out.println("TaxAmount " + taxAmount);
        }
        s.close();

    }

}
