import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> responses = ChatbotData.getResponses();

        System.out.println("=================================");
        System.out.println(" Welcome to College Enquiry Bot ");
        System.out.println("=================================");
        System.out.println("Ask about: admission, courses, fees, timings, placements, contact");
        System.out.println("Type 'exit' to quit.");
        System.out.println();

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("Bot: Thank you for visiting. Have a great day!");
                break;
            }

            boolean found = false;

            for (String key : responses.key
