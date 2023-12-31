package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(double newLength, double newWidth) {
        super(newLength, newWidth);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
