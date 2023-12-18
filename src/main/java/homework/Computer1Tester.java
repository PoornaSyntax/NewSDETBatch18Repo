package homework;

public class Computer1Tester {
    public static void main(String[] args) {
        Computer1[] arr={new Apple("Apple",1000,250)
                ,new Dell("Dell",2000,250),
                new HP("HP",1000,250),
                new Lenovo("Lenovo",1000,250)};
        for (Computer1 c: arr){
            c.printInfo();
            c.playVideo();
            c.browseInternet();
        }

}}
