package homework;

public class VehicleTester_1 {
    public static void main(String[] args) {
        Vehicle_1[] vArr = {new Car_1(90,"White","Regular"),
                new Truck_1(65,"Black","Diesel"),
                new Motorcycle_1(70,"Blue","Regular"),
                new Bicycle_1(10,"Green","battery")};

        for (int i = 0; i < vArr.length; i++) {
            Vehicle_1 v = vArr[i];
            v.printInfo();
            v.accelerate();
            v.brake();

            if(v instanceof Truck_1){
                ((Truck_1) v).loadcargo();
            } else if (v instanceof Motorcycle_1) {
                ((Motorcycle_1) v).stunt();
            } else if (v instanceof Bicycle_1) {
                ((Bicycle_1) v).ringBell();
            }
            System.out.println("**");
        }
    }
}
