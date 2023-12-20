package homework;

public class Vehicle {
    /*
    Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.

Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array.
Iterate through the array to demonstrate polymorphism.
     */

        private int speed;
        private String color;
        private String fuelType;

        public Vehicle(int speed, String color, String fuelType) {
            this.speed = speed;
            this.color = color;
            this.fuelType = fuelType;
        }
    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public void loadCargo() {
        System.out.println("loading cargo");
    }

    public void accelerate() {

            System.out.println("Vehicle is accelerating.  " );
        }

        public void brake() {

            System.out.println("Vehicle is braking. " );
        }
    }

    class Car extends Vehicle {
        public Car(int speed, String color, String fuelType) {
            super(speed, color, fuelType);
        }

        @Override
        public void accelerate() {
            System.out.println("Car is accelerating");

        }
        public void brake(){
            System.out.println("Car is stopping");
        }
    }

    class Truck extends Vehicle {
        public Truck(int speed, String color, String fuelType) {
            super(speed, color, fuelType);

        }
        public void accelerate() {
            System.out.println("Truck is accelerating");
        }

        @Override
        public void brake() {
            System.out.println("Truck is breaking");

        }

        public void loadCargo() {
            System.out.println("Truck is loading cargo");

        }
    }

    class Motorcycle extends Vehicle {
        public Motorcycle(int speed, String color, String fuelType) {
            super(speed, color, fuelType);
        }

        public void performStunt() {
            System.out.println("Motorcycle is performing a stunt.");
        }
        public void accelerate() {

        }

        @Override
        public void brake() {
            System.out.println("Motorcycle is breaking");

        }
    }

    class Bicycle extends Vehicle {
        public Bicycle(int speed, String color) {
            super(speed, color);
        }
        public void accelerate() {
            // Empty implementation, overriding the Vehicle's accelerate method
        }
        public void brake() {
            System.out.println("Bicycle  is breaking");

        }

        public void ringBell() {
            System.out.println("Bicycle is ringing the bell.");

        }
    }

     class VTester {
        public static void main(String[] args) {

            Vehicle[] vehicleArr = {new Car(60, "Red", "Petrol"),
                    new Truck(40, "Blue", "Diesel"),
                    new Motorcycle(80, "Black", "Gasoline"),
                    new Bicycle(20, "Green")
            };


           //for (Vehicle vehicle : vehicleArr) {
            for(int i=0;i<vehicleArr.length;i++){
                Vehicle vehicle=vehicleArr[i];
                vehicle.accelerate();
                vehicle.brake();

                if (vehicle instanceof Motorcycle) {
                    ((Motorcycle) vehicle).performStunt();
                } else if (vehicle instanceof Truck) {
                    ((Truck) vehicle).loadCargo();
                    // ((Truck) vehicle).unloadCargo();
                } else if (vehicle instanceof Bicycle) {
                    ((Bicycle) vehicle).ringBell();
                }


            }


                  }



        }




