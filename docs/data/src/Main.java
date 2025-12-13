import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);System.out.println("=================================");
        System.out.println("Type 'help' to see available topics.");
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

    if (userInput.equals("help")) {
        System.out.println("Bot: You can ask about the following topics:");
        System.out.println("- admission");
        System.out.println("- courses");
        System.out.println("- fees");
        System.out.println("- timings");
        System.out.println("- placements");
        System.out.println("- contact");
        continue;
    }

    boolean found = false;

    for (String key : responses.keySet()) {
        if (userInput.contains(key)) {
            System.out.println("Bot: " + responses.get(key));
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Bot: Sorry, I couldn't understand your question. Type 'help' for options.");
    }
}
       
       
