package class19;

public class Computer {
    /*Create Class Computer that will have 4 subclasses as Apple,Lenova,HP,Dell.
    Define common behavior within and some fields in parent class and override some of the methods
    in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through
    each object and execute available methods.
     */
    private String name;
    private int ssd;
    private int ram;

    public Computer(String name,int ssd, int ram){
        this.name = name;

        this.ssd = ssd;
        this.ram = ram;
    }
    public void printInfo(){
        System.out.println(name+" "+ssd+" "+ram);
    }
    public void startUp(){
        System.out.println("Computer is starting up");
    }
    public void shutDown(){
        System.out.println("Computer is shutting down");
    }
}
class Apple extends Computer{
    public Apple(String name, int ssd,int ram){
        super(name, ssd, ram);
    }
    @Override
    public void startUp() {
        super.startUp();
    }

    @Override
    public void shutDown() {
        super.shutDown();
    }

    public void iTunes(){
        System.out.println("Playing music in iTunes");
    }
}

class Lenovo extends Computer{
    public Lenovo(String name, int ssd,int ram){
        super(name, ssd, ram);
    }
    @Override
    public void startUp() {
        super.startUp();
    }

    @Override
    public void shutDown() {
        super.shutDown();
    }
    public void browsing(){
        System.out.println("Browsing internet on Lenevo laptop");
    }
}
class HP extends Computer{
    public HP(String name, int ssd,int ram){
        super(name, ssd, ram);
    }
    @Override
    public void startUp() {
        super.startUp();
    }
    public void photoshop(){
        System.out.println("Using Photoshop on HP laptop");
    }

    @Override
    public void shutDown() {
        super.shutDown();
    }
}

class Dell extends Computer{
    public Dell(String name, int ssd,int ram){
        super(name, ssd, ram);
    }
    @Override
    public void startUp() {
        super.startUp();
    }
    public void gaming(){
        System.out.println("Playing game on Dell laptop");
    }

    @Override
    public void shutDown() {
        super.shutDown();
    }
}




