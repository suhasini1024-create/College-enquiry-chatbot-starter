import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" Welcome to College Enquiry Bot ");
        System.out.println("=================================");
        System.out.println("You can ask about: admission, courses, fees, timings, placements, contact");
        System.out.println("Type 'exit' to quit.");
        System.out.println();

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("Bot: Thank you for visiting. Have a great day!");
                break;
            }

            if (userInput.contains("admission")) {
                System.out.println("Bot: Admissions are based on merit and entrance exam results.");
            } 
            else if (userInput.contains("course")) {
                System.out.println("Bot: The college offers UG and PG programs in multiple disciplines.");
            } 
            else if (userInput.contains("fee")) {
                System.out.println("Bot: Fee structure varies by course. Please contact the office.");
            } 
            else if (userInput.contains("time")) {
                System.out.println("Bot: College timings are from 9:30 AM to 4:30 PM.");
            } 
            else if (userInput.contains("placement")) {
                System.out.println("Bot: The college provides placement support through a placement cell.");
            } 
            else if (userInput.contains("contact")) {
                System.out.println("Bot: You can contact the college via phone or email from the website.");
            } 
            else {
                System.out.println("Bot: Sorry, I didn't understand that. Please ask a valid question.");
            }
        }

        scanner.close();
    }
}
