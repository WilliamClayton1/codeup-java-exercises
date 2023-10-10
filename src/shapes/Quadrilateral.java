package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;

    protected double width;

    public Quadrilateral (double newLength, double newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

}
