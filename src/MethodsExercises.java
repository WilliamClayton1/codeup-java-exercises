import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        factorialPrint();

    }

    public static void addition(long intOne, long intTwo) {
        System.out.println(intOne + intTwo);
    }

    public static void subtraction(long intOne, long intTwo) {
        System.out.println(intOne - intTwo);
    }

    public static void multiplication(long intOne, long intTwo) {
        System.out.println(intOne * intTwo);
    }

    public static void division(long intOne, long intTwo) {
        System.out.println(intOne / intTwo);
    }

    public static void remainder(long intOne, long intTwo) {
        System.out.println(intOne % intTwo);
    }

    public static int getInteger(int min, int max) {


        System.out.printf("Enter a number between %d and %d.%n", min, max);

        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {

            return userInput;

        }
        System.out.println("That's not right, try again");
        return getInteger(min, max);
    }

    public static void factorialPrint(){
        int myUsersNum = getInteger(1, 10);
        String myOutput = "1";
        int mathBucket = 1;

        for (int i = 1; i <= myUsersNum; i++) {
            if(i == 1){
                System.out.printf("%d! = %-16s = %d%n", i, myOutput, mathBucket);
                continue;
            }

            mathBucket *= i;
            myOutput += " x " + i;

            System.out.printf("%d! = %-16s = %d%n", i, myOutput,mathBucket);

        }

    }
}



