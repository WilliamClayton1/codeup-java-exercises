public class Car {
    //Classes let us define custom objects - imagine it as a blueprint, template, or character sheet to be followed

        //Classes have fields - fields are variables (properties of WHAT a class is) and methods (ACTIONS/BEHAVIORS a class can do)

        //First example: Make; model, year, honk() [model + make + " honks its horn!"] fields

        public String make;
        public String model;
        public int year;

        public void honkHorn() {
            System.out.printf("%s %s Honks its horn", make, model);
        }

        //Static - an instance of a class (an object) can have individual and unique values to their fields. Non-unique fields are flagged with the 'static' keyword.

    //Let's look at the Math object
    double piExample = Math.PI; //Command click 'Math' to see the entire object, 'PI' to see the property of the object

        //We usually start using the Math object to think about static since we don't make a unique instance of Math - there is only a global thing CALLED Math that would never have a personal, unique copy of it made (Kenny's Math vs Gilly's Math vs. Gonzo's Math < that doesn't make sense! There is only Math!"

        //Second example: static carInventoryCount property.

        public static int carInventoryCount;


        //Constructors - all constructors are methods, all methods can be overloaded.

        //Third example: car constructor method that auto-increments static carInventoryCount when each car is made

        //Fourth example: overloading constructor to allow for missing model / year

        //This - think of it as saying ME, MYSELF, THIS object.

        //Fifth example: logCarInfo()

        //Visibility - let's set up a private String that is carOwner and set up a small application running class called dealershipApp to see if we can access info in the other class.

    public static void main (String[] args) {
//        making a car without any details
        Car willsCar = new Car();

//        assigning values to the car
        willsCar.make = "Nissan";
        willsCar.model = "Versa";
        willsCar.year = 2012;

        willsCar.honkHorn();

        System.out.printf("Here some information about my car %s %s %d%n", willsCar.make, willsCar.model, willsCar.year);


        Car.carInventoryCount = 0;

        carInventoryCount++;

        System.out.println("Car inventory is: " + carInventoryCount);

        carInventoryCount++;

        System.out.println("Car inventory is: " + carInventoryCount);


    }
}
