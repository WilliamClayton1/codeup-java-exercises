package shapes;

class Square extends Rectangle {

    //constructor that set the length and width from the parent element
    public Square(int side) {
        super(side,side);
    }

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

        System.out.println(box1.getArea(5, 4));
        System.out.println(box1.getPerimeter(5, 4));

        System.out.println(box2.getArea(5, 5));
        System.out.println(box2.getPerimeter(5, 5));

//        int side = 3;
//        Rectangle shape1 = new Rectangle(side,side);
//        int area = shape1.length*shape1.width;
//        System.out.println(area);
    }
}
