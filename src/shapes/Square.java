package shapes;

class Square extends Rectangle {

    //constructor that set the length and width from the parent element
    public Square(int side) {
        super(side,side);
    }

    public int getArea(int side){
        return side * side;
    }

    public int getPerimeter(int side) {
        return 4 * side;
    }
}
