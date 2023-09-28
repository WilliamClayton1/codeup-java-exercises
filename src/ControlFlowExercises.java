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
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");

        int userInput = scanner.nextInt();

        System.out.println("Here is your table!");
//        System.out.println("\n");
        System.out.println("number" + " | " + "squared" + " | " + "cubed" );
        System.out.println("------" + " | " + "-------" + " | " + "------");


    }
}
