package homework;

public class Computer1 {
    private String name;
    private int price;
    private int memory;

    public Computer1(String name, int price, int memory) {
        this.name = name;
        this.price = price;
        this.memory = memory;
    }
    public void printInfo(){
        System.out.println(name+" "+price+" "+memory);
    }
    public void browseInternet(){
        System.out.println("Open the link");
    }
    public void playVideo(){
        System.out.println("Open the video");
    }
}
class Apple extends Computer1{
    public Apple(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void playVideo(){
        System.out.println("Open the video on homework.Apple computer");
    }
}
class Lenovo extends Computer1{
    public Lenovo(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void browseInternet(){
        System.out.println("Open the link on homework.Lenovo");
    }
}
class HP extends Computer1 {
    public HP(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void browseInternet(){
        System.out.println("Open the link on homework.HP");
    }
}
class Dell extends Computer1{
    public Dell(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void playVideo(){
        System.out.println("Open the video on homework.Dell computer");
    }
}
