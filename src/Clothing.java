public class Clothing {

    public String type;

    public String color;

    public int size;

    public static void main (String[] args) {

        Clothing jeans = new Clothing();

        jeans.type = "pants";
        jeans.color = "blue";
        jeans.size = 36;

        Clothing shirt = new Clothing();

        shirt.type = "t-shirt";
        shirt.color = "grey";
        shirt.size = 44;

        System.out.printf("Im wearing a %s %s with %s %s", shirt.color, shirt.type, jeans.color, jeans.type);

    }

}
