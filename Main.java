import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      AI EMAIL WRITER");
        System.out.println("=================================");

        while (true) {

            System.out.println("\nSelect Email Type:");
            System.out.println("1. Leave Application");
            System.out.println("2. Internship Request");
            System.out.println("3. Job Application");
            System.out.println("4. Meeting Request");
            System.out.println("5. Thank You Email");
            System.out.println("6. Exit");

            System.out.print("\nEnter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 6) {
                System.out.println("Thank You for Using AI Email Writer!");
                break;
            }

            UserInput input = UserInput.getUserDetails(sc);

            String email = EmailGenerator.generateEmail(choice, input);

            System.out.println("\n=================================");
            System.out.println(" GENERATED EMAIL ");
            System.out.println("=================================\n");

            System.out.println(email);
        }

        sc.close();
    }
}