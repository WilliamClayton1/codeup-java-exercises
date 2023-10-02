import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean conversation = false;

        do {
            System.out.println("What's Up?");

            String userInput = scanner.nextLine();

            if (userInput.lastIndexOf("?") != -1) {
                System.out.println("Sure.");
            } else if (userInput.lastIndexOf("!") != -1) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.lastIndexOf("") != -1) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.' to anything else");
            }

            System.out.println("Do you wanna keep talking? (Yes/No)");
            String userAnswer = scanner.nextLine();

            conversation = userAnswer.equalsIgnoreCase("yes");
        }
        while (conversation);

    }
}
