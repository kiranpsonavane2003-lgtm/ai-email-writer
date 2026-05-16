public class EmailGenerator {

    public static String generateEmail(int choice, UserInput input) {

        switch (choice) {

            case 1:
                return EmailTemplates.leaveApplication(input);

            case 2:
                return EmailTemplates.internshipRequest(input);

            case 3:
                return EmailTemplates.jobApplication(input);

            case 4:
                return EmailTemplates.meetingRequest(input);

            case 5:
                return EmailTemplates.thankYouEmail(input);

            default:
                return "Invalid Choice!";
        }
    }
}