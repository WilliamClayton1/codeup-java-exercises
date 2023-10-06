package util;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString () {
        System.out.println("Enter a movie title: ");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public void yesNo() {
        System.out.println("Enter a yes or no answer");
        String answer = scanner.nextLine();

        if (answer.contains("y") || answer.contains("Y")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public int getInt(int min, int max) {


        System.out.printf("Enter any number between %d and %d.%n", min, max);

        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {

            System.out.println("That's right");
            return userInput;

        }
        System.out.println("That's not right, try again");
        return getInt(min, max);
    }

    public int getInt() {
        System.out.printf("Enter your choice: %n");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %.2f and %.2f.%n", min, max);

        double userInput = scanner.nextDouble();

        if (userInput >= min && userInput <= max) {

            System.out.println("That's right");
            return userInput;

        }
        System.out.println("That's not right, try again");
        return getDouble(min, max);
    }

    public double getDouble() {
        System.out.println("Enter any decimal number you'd like.");
        double userInput = scanner.nextDouble();

        System.out.println(userInput);
        return userInput;
    }

    public static void main (String[] args) {
        Input user = new Input();
//        user.getString();
//        user.yesNo();
//        user.getInt(1,20);
//        user.getInt();
        user.getDouble();

    }

}
