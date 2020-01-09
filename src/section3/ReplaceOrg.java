package section3;

import java.util.Scanner;

public class ReplaceOrg {

    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String content = s.nextLine();
        System.out.println("Enter the old name of the company");
        String content1 = s.nextLine();
        System.out.println("Enter the new name of the company");
        String content2 = s.nextLine();
        System.out.println("The content of the modified document is");
        System.out.println(content.replace(content1, content2));

    }

}
