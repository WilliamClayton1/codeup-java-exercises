import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //while loop
        int i = 5;
        while(i <= 15) {
            System.out.print(i+" ");
            i++;
        }

        System.out.println("\n");

        //do while
        i = 100;
        do {
            System.out.print(i + " ");
            i -= 5;
        } while (i >= 0);

        System.out.println("\n");

        long x = 2;
        do {
            System.out.println(x);
            x *= x;
        } while(x < 1000000);

        System.out.println("\n");

        //for loop
        for (i = 5; i <= 15 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println("\n");

        for (i = 100; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (x = 2; x < 1000000 ; x *= x) {
            System.out.println(x);
        }

        System.out.println("\n");

        //fizzbuzz
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                System.out.print("Fizz ");
            } else if (j % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(j + " ");
            }
        }
        System.out.println("\n");

        //table of power
        int y = 0;
        do {

            Scanner scanner = new Scanner(System.in);

            System.out.print("What number would you like to go up to?");

            int userInput = scanner.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number" + " | " + "squared" + " | " + "cubed" );
            System.out.println("------" + " | " + "-------" + " | " + "------");

            for (int j = 1; j <= userInput; j++) {
                System.out.printf("%6d | %7d | %5d%n", j, j * j, j * j * j);
            }
            y++;

            System.out.println("Do you want top continue?");
            String userSecondInput = scanner.next();

            if (userSecondInput.equalsIgnoreCase("no")) {
                break;
            }
        }
        while (y < 10);


        //grade convert
        Scanner scanner = new Scanner(System.in);

        int n = 1;
        do {

            System.out.println("What is your number grade?");

            int userInput3 = scanner.nextInt();

            if (userInput3 >= 88) {
                System.out.println("A");
            } else if (userInput3 >= 80) {
                System.out.println("B");
            }else if (userInput3 >= 67) {
                System.out.println("C");
            }else if (userInput3 >= 60) {
                System.out.println("D");
            }else if (userInput3 >= 0) {
                System.out.println("F");
            }

            n++;
            System.out.println("Do you want top continue?");
            String userSecondInput = scanner.next();

            if (userSecondInput.equalsIgnoreCase("no")) {
                break;
            }
        }
        while (n < 10);


    }
}
