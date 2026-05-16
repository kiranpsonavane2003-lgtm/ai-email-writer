public class EmailTemplates {

    public static String leaveApplication(UserInput input) {

        return "Subject: Leave Application\n\n" +

                "Dear " + input.receiverName + ",\n\n" +

                "I hope you are doing well.\n" +

                "I am writing to request leave due to " +
                input.reason + ".\n\n" +

                "Kindly grant me leave for the required period.\n\n" +

                "Thank you for your consideration.\n\n" +

                "Sincerely,\n" +
                input.senderName;
    }

    public static String internshipRequest(UserInput input) {

        return "Subject: Internship Request\n\n" +

                "Dear " + input.receiverName + ",\n\n" +

                "I hope you are doing well.\n\n" +

                "My name is " + input.senderName +
                " and I am interested in applying for an internship opportunity at " +
                input.companyName + ".\n\n" +

                "I have knowledge of Java, HTML, CSS, JavaScript, and MySQL.\n" +

                "I am eager to learn and contribute to your organization.\n\n" +

                "Thank you for your time and consideration.\n\n" +

                "Sincerely,\n" +
                input.senderName;
    }

    public static String jobApplication(UserInput input) {

        return "Subject: Job Application\n\n" +

                "Dear " + input.receiverName + ",\n\n" +

                "I am writing to apply for the position available at " +
                input.companyName + ".\n\n" +

                "I have skills in software development and strong interest in technology.\n\n" +

                "I would appreciate the opportunity to discuss my qualifications further.\n\n" +

                "Thank you.\n\n" +

                "Sincerely,\n" +
                input.senderName;
    }

    public static String meetingRequest(UserInput input) {

        return "Subject: Meeting Request\n\n" +

                "Dear " + input.receiverName + ",\n\n" +

                "I hope you are doing well.\n\n" +

                "I would like to request a meeting regarding " +
                input.reason + ".\n\n" +

                "Please let me know a suitable time for the discussion.\n\n" +

                "Thank you.\n\n" +

                "Sincerely,\n" +
                input.senderName;
    }

    public static String thankYouEmail(UserInput input) {

        return "Subject: Thank You\n\n" +

                "Dear " + input.receiverName + ",\n\n" +

                "Thank you for your support and guidance regarding " +
                input.reason + ".\n\n" +

                "I truly appreciate your help and time.\n\n" +

                "Looking forward to staying connected.\n\n" +

                "Sincerely,\n" +
                input.senderName;
    }
}