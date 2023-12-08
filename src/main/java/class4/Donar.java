package class4;

public class Donar {
    public static void main(String[] args) {
        int age = 25;
        double weight= 180;
        if(age>=18){
            if(weight>=110){
                System.out.println("You are eligible for blood donation");
            }else{
                System.out.println("You are not eligible for blood donation");
            }
            }else{
            System.out.println("We cannot acept such a patient");
        }
    }
}
