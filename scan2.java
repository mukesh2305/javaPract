import java.util.Scanner;

public class scan2 {
    public static void main(String arg[]) {
        String name;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("May i know your name");
            name = sc.nextLine();
        }

        System.out.println("Welcome " + name);

    }
}
