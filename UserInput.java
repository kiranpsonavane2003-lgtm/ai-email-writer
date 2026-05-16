import java.util.*;

public class UserInput {

    String senderName;
    String receiverName;
    String companyName;
    String reason;

    public UserInput(String senderName,
                     String receiverName,
                     String companyName,
                     String reason) {

        this.senderName = senderName;
        this.receiverName = receiverName;
        this.companyName = companyName;
        this.reason = reason;
    }

    public static UserInput getUserDetails(Scanner sc) {

        System.out.print("Enter Your Name: ");
        String sender = sc.nextLine();

        System.out.print("Enter Receiver Name: ");
        String receiver = sc.nextLine();

        System.out.print("Enter Company/College Name: ");
        String company = sc.nextLine();

        System.out.print("Enter Reason/Message: ");
        String reason = sc.nextLine();

        return new UserInput(sender, receiver, company, reason);
    }
}