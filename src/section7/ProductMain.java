package section7;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = s.nextLong();
        System.out.println("Enter the product name");
        String productName = s.next();
        System.out.println("Enter the supplier name");
        String supplierName = s.next();
        Product obj = new Product(id, productName, supplierName);
        obj.display(id, productName, supplierName);
        System.out.println("Enter the product id");
        Long id1 = s.nextLong();
        System.out.println("Enter the product name");
        String productName1 = s.next();
        System.out.println("Enter the supplier name");
        String supplierName1 = s.next();
        Product obj1 = new Product(id1, productName1, supplierName1);
        obj1.display(id1, productName1, supplierName1);
        if (obj.equals(obj1)) {
            System.out.println("The two products are the same ");
        } else {
            System.out.println("The two products are different ");
        }

        s.close();

    }
}
