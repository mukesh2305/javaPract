import java.util.*;

import javax.print.DocFlavor.STRING;

public class scan1 {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // int x = sc.nextInt();
            // float y = sc.nextFloat();
            // String z = sc.next();
            // String line = sc.nextLine();

            // System.out.println(x);
            // System.out.println(y);
            // System.out.println(z);
            // System.out.println(line);

            // int x, y;
            // System.out.println("Enter 2 Number");
            // x = sc.nextInt();
            // y = sc.nextInt();

            // int z = x + y;
            // System.out.println(z);

            sc.useRadix(2);
            int x = sc.nextInt();
            System.out.println(x);

        }
    }
}

// javap java.util.Scanner