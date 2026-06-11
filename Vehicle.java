class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make , String model , int year){
        this.make = make ;
        this.model = model;
        this.year = year;
    }

    public void serMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String model){
        this.model= model;
    }
    public String getModel(){
        return model ;
    }
    public void setYear(int year){
        this.year = year ;
    }
    public int getYear(){
        return year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, 4);
        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "R6", 2019, "Red");

        car1.displayCarInfo();
        System.out.println();
        motorcycle1.displayMotorcycleInfo();
    }

}

class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String make , String model , int year, int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void displayCarInfo() {
        System.out.println("This is a car");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle{
    private String color;

    public Motorcycle(String make , String model , int year, String color){
        super(make, model, year);
        this.color = color;
    }

    public String getColor() {
        return color    ;
    }

    public void displayMotorcycleInfo() {
        System.out.println("This is a motorcycle");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Color: " + color);
    }
}
