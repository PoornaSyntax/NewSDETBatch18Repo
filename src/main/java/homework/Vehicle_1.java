package homework;

public class Vehicle_1 {
    private int speed;
    private String color;
    private String fuelType;

    public Vehicle_1 (int speed, String color, String fuelType){
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
    }
    public Vehicle_1(int speed, String color){
        this.speed = speed;
        this.color=color;
    }
    public void printInfo(){
        System.out.println(speed+" mph "+color+" "+fuelType);
    }
    public void accelerate(){
        System.out.println("Speeding fast");
    }
    public void brake(){
        System.out.println("Braking");
    }
}
class Car_1 extends Vehicle_1{
    public Car_1(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void printInfo(){
        super.printInfo();
    }
    public void accelerate(){
        System.out.println("Speeding fast");
    }
    public void brake(){
        System.out.println("car is stopping");
    }
}
class Truck_1 extends Vehicle_1{
    public Truck_1(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }

    public void loadcargo(){
        System.out.println("Truck is loading a cargo");
    }
    public void accelerate(){
        System.out.println("Truck is accelerating.");
    }
    public void brake(){
        System.out.println("Truck is braking to stop");
    }
}
class Motorcycle_1 extends Vehicle_1{
    public Motorcycle_1(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void accelerate(){
        System.out.println("Bike is going faster");
    }
    public void stunt(){
        System.out.println("Motorcycle is performing a stunt");
    }
}
class Bicycle_1 extends Vehicle_1{
    public Bicycle_1(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void brake(){
        System.out.println("Bicycle is stopping");
    }
    public void ringBell(){
        System.out.println("Bicycle is ringing a bell");
    }
}

