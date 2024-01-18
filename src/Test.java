import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        String[] arrOfStr = A.split("");
        String[] arrOfStrB = B.split("");

        System.out.println(arrOfStr.length + arrOfStrB.length);

        if(A.compareTo(B) == 0 || A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
