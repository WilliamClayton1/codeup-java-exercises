package shapes;

public class ShapeTest {

    public static void main (String[] args) {
        Measurable myShape;

        Rectangle box1 = new Rectangle(5, 4);
        Square box2 = new Square(5);

        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }
}
