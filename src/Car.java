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

        //have access to the same package
        protected String ownerName;

        //only have access to the class
        private String vinNum;

    public String getVinNum() {
        return this.vinNum;
    }

    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }

    //Static - an instance of a class (an object) can have individual and unique values to their fields. Non-unique fields are flagged with the 'static' keyword.

    //Let's look at the Math object
    double piExample = Math.PI; //Command click 'Math' to see the entire object, 'PI' to see the property of the object

        //We usually start using the Math object to think about static since we don't make a unique instance of Math - there is only a global thing CALLED Math that would never have a personal, unique copy of it made (Kenny's Math vs Gilly's Math vs. Gonzo's Math < that doesn't make sense! There is only Math!"

        //Second example: static carInventoryCount property.

        public static int carInventoryCount;


        //Constructors - all constructors are methods, all methods can be overloaded.

        //Third example: car constructor method that auto-increments static carInventoryCount when each car is made

        public Car () {
            carInventoryCount++;
        }

        //Fourth example: overloading constructor to allow for missing model / year

        public Car (String carMake, int carYear) {
//            make = carMake;
//            year = carYear;
//            model = "unknown";
            this(carMake, "unassigned", carYear);
        }

        public Car (String carMake, String carModel, int carYear) {
            make = carMake;
            year = carYear;
            model = carModel;
        }

        public Car (String carMake, String carModel) {
            this(carMake, carModel, 0);
        }

        //This - think of it as saying ME, MYSELF, THIS object.

        //Fifth example: logCarInfo()

    public void logCarInfo () {
        System.out.printf("This current is a %s make of a %s model of a %d%n", this.make, this.model, this.year);
    }

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

        System.out.println("Car inventory is: " + carInventoryCount);

        System.out.println("Car inventory is: " + carInventoryCount);

        Car mysteryCar = new Car("suzuki", 2001);

        System.out.println(mysteryCar.make);
        System.out.println(mysteryCar.year);

        Car gonzoCar = new Car("Toyota", "Camry", 2016);

        System.out.println(gonzoCar.make);
        System.out.println(gonzoCar.model);
        System.out.println(gonzoCar.year);

        willsCar.logCarInfo();
        gonzoCar.logCarInfo();

        //have access in the same package
        gonzoCar.ownerName = "Gonzalo";

        //have access in the same class
        gonzoCar.vinNum = "1234567";
    }
}
