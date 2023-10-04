package shapes;

public class Circle {
    private double radius;

    public double getRadius () {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main (String[] args) {
        Circle circle1 = new Circle(12);

        System.out.printf("%.2f%n",circle1.getArea());
        System.out.printf("%.2f%n",circle1.getCircumference());
    }
}
