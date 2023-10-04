package util;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public String getString () {
        System.out.println("Type something: ");
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

    public void getInt() {
        System.out.println("Enter any number you'd like.");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f.%n", min, max);

        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {

            System.out.println("That's right");
            return userInput;

        }
        System.out.println("That's not right, try again");
        return getDouble(min, max);
    }

    public void getDouble() {
        System.out.println("Enter any number you'd like.");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
    }

    public static void main (String[] args) {
        Input user = new Input();
//        user.getString();
//        user.yesNo();
//        user.getInt(1,20);
//        user.getInt();
        user.getDouble(12.05, 50.02);
    }

}
