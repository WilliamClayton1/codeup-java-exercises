package shapes;

class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
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
