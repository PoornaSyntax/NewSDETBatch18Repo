package class14;

public class Person {
    static int noOfEye=2;
    String name;
    int age;
    double weight;

    void printInfo(){
        int maxAge=200;
        System.out.println(name+" "+age+" "+weight);
    }


    static void printNoOfEyes(){

        System.out.println(noOfEye);
    }
}
