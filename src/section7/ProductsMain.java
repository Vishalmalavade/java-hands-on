package section7;

import java.util.Scanner;

public class ProductsMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = s.nextLong();
        s.nextLine();
        System.out.println("Enter the product name");
        String productName = s.nextLine();
        System.out.println("Enter the supplier name");
        String supplierName = s.nextLine();
        Products p = new Products(id, productName, supplierName);
        System.out.println(id + ":" + productName + ":" + supplierName);
        System.out.println("Invoking getClass() method:" + p.getClass().getName());

        s.close();
    }

}
