package shapes;

public class Rectangle {

    protected int length;

    protected  int width;

    public Rectangle (int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

    public int getArea(int length, int width){
        return length * width;
    }

    public int getPerimeter(int length, int width) {
        return 2 * length + 2 * width;
    }
}
