import java.util.Scanner;
import java.text.*;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159f;

        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
//Scanner class

        //Prompt 1
        System.out.println("Enter a number: ");

        int userInput = scanner.nextInt();

        System.out.println(userInput);

        //Prompt 2
        System.out.println("Enter three words: ");

        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.println(userInput1);
        System.out.println(userInput2);
        System.out.println(userInput3);

        //Prompt 3
        System.out.println("Enter a sentence: ");

        String userMessage = scanner.nextLine();

        System.out.println(userMessage);

//Perimeter and Area

        //Prompt 1
        System.out.println("Enter the width and height of a room of your choice.");

        String userMeasurement1 = scanner.nextLine();
        String userMeasurement2 = scanner.nextLine();

        System.out.println("Length: " + userMeasurement1);
        System.out.println("Width: " + userMeasurement2);

        //Prompt 2
        int length = Integer.parseInt(userMeasurement1);
        int width = Integer.parseInt(userMeasurement2);
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.println("The area of this room is: " + area);
        System.out.println("The perimeter of the room is: " + perimeter);


    }
}
