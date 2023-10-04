package shapes;
import java.util.Scanner;
import util.Input;
import shapes.Circle;

public class CircleApp {

    public static void main (String[] args) {
        //prompts the user for the radius of the circle using your Input class
        Input user = new Input();

        double userRadius = user.getDouble();

        Circle circle = new Circle(userRadius);

        double circleArea = circle.getArea();
        double circleCircumference = circle.getCircumference();

        System.out.printf("The area of this circle is %.2f and the circumference is %.2f", circleArea, circleCircumference);

        // creates a Circle object
        // displays the circumference and area.
        // (Note that you will need to import your Input class.)
    }


}
