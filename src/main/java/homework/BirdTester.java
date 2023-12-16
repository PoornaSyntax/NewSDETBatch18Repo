package homework;

public class BirdTester {
    public static void main(String[] args) {
        Sparrow b1=new Sparrow("mini","Brown",22,4);
        System.out.println("SPARROW");
        b1.printInfo();

        Parrot b2=new Parrot("Coco","Yellow",80,5);
        System.out.println("PARROT:");
        b2.printInfo();

        System.out.println("Special feature : "+b2.specialFeature());

    }

}
