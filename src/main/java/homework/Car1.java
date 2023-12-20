package homework;

public class Car1 {
    /*
     Create a class Car with properties like make, model, and year.
     Implement a method calculate_rental_price based on the number of rental days.
     Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method
     in LuxuryCar to include additional charges.
     Demonstrate the functionality by creating instances of each class and calling their methods
     */
    private String make;
    private String model;
    private int year;
    public Car1(){

    }
    public Car1(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year=year;
    }
    public double calcrentalprice(int rentalDays){

        return rentalDays*50;//$50 per day
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

}
class LuxuryCar extends Car1{
    public LuxuryCar(String a,String b,int c){

        super(a,b,c);
    }

    public double calcrentalprice(int rentalDays) {
        double price = super.calcrentalprice(rentalDays);
        return price +(price*0.2); //20% surcharge for luxury car
    }

}

class EconomyCar extends Car1{
    public EconomyCar(String a,String b,int c){

        super(a,b,c);
    }
}
class CarTester{
    public static void main(String[] args) {


        LuxuryCar lc = new LuxuryCar("BMW", "X5", 2023);
        EconomyCar ec = new EconomyCar("Honda", "Civic", 2021);
        int rentalDays = 5;
        double Total = ec.calcrentalprice(rentalDays);
        System.out.println("Rental Price for "+ec.getMake()+ " "+ec.getModel()+" is $ "+ Total);
        Total = lc.calcrentalprice(rentalDays);
        System.out.println("Rental Price for "+lc.getMake()+" "+lc.getModel()+" is $ "+Total);
}}