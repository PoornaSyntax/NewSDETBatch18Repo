package class21;

public abstract class Vehicle {

        private String make;
        private String model;
        private double fuelLevel;
        public Vehicle(String make, String model, double fuelLevel) {
            this.make = make;
            this.model = model;
            this.fuelLevel = fuelLevel;
        }
        public abstract void startEngine();
        public abstract void stopEngine();
        public  void fuelUp() {
         System.out.println("Current fuel level is : "+getFuelLevel()+" check to fuel up ");
          }
        public String getMake() {
        return make;
        }
        public String getModel() {
        return model;
        }
        public double getFuelLevel() {
        return fuelLevel;
        }

    }
    class Car extends Vehicle {

        public Car(String make, String model, double fuelLevel) {
            super(make, model, fuelLevel);
        }
        @Override
        public void startEngine()
        {
            System.out.println("Car engine started for " + getMake() + " " + getModel());
        }

        @Override
        public void stopEngine()
        {
            System.out.println("Car engine stopped for " + getMake() + " " + getModel());
        }

        @Override
        public void fuelUp() {
            super.fuelUp();
            System.out.println("Fuel level for "+getMake()+" "+getModel()+" is : "+getFuelLevel());
        }
    }
    class Truck extends Vehicle {
        public Truck(String make, String model, double fuelLevel)
        {
            super(make, model, fuelLevel);
        }
        @Override
        public void startEngine() {
            System.out.println("Truck engine started for " + getMake() + " " + getModel());
        }
        @Override
        public void stopEngine() {
            System.out.println("Truck engine stopped for " + getMake() + " " + getModel());
        }
        @Override
        public void fuelUp() {
            super.fuelUp();
            System.out.println(" Fuel level for " + getMake() + " " + getModel() + " is : " + getFuelLevel());
        }

    }

    class Motorcycle extends Vehicle {


        public Motorcycle(String make, String model, double fuelLevel) {
            super(make, model, fuelLevel);

        }
        @Override
        public void startEngine() {
            System.out.println("Motorcycle engine started for " + getMake() + " " + getModel());
        }

        @Override
        public void stopEngine() {
            System.out.println("Motorcycle engine stopped for " + getMake() + " " + getModel());
        }

        @Override
        public void fuelUp() {
            super.fuelUp();
            System.out.println("Fuel level for "+getMake()+" "+getModel()+" is "+getFuelLevel());
        }

    }

    class VehicleTester {
        public static void main(String[] args)
        {


            Vehicle[] arr = {new Car("Toyota", "Camry", 10.0),
                    new Truck("Ford", "F-150", 20.0),
                    new Motorcycle("Harley-Davidson", "Sportster", 5.0)};

            for (int i = 0; i < arr.length; i++) {
                Vehicle v = arr[i];
                v.startEngine();
                v.stopEngine();
                v.fuelUp();

            }


        }}



