package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;

    protected int width;

    public double length() {
        return this.length;
    }

    public double width() {
        return this.width;
    }

    public Quadrilateral (int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

}
