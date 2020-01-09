package section4;

import java.util.Scanner;

public class ProductMain {

    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        ProductDetails pd = new ProductDetails();

        System.out.println("Enter the product id ");
        long id = Long.parseLong(scn.nextLine());
        pd.setid(id);

        System.out.println("Enter the product name ");
        String Pname = scn.nextLine();
        pd.setProductName(Pname);

        System.out.println("Enter the supplier name ");
        String Sname = scn.next();
        pd.setSupplierName(Sname);

        pd.display();

    }

}
