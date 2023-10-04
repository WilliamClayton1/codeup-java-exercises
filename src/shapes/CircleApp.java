package shapes;
import util.Input;

public class CircleApp {

    public static void main (String[] args) {
        Input user = new Input();

        double userRadius = user.getDouble();

        Circle circle = new Circle(userRadius);

        double circleArea = circle.getArea();

        double circleCircumference = circle.getCircumference();

        System.out.printf("The area of this circle is %.2f and the circumference is %.2f", circleArea, circleCircumference);
    }


}

