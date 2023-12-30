package review9;

public abstract class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color=color;
        this.age=age;
    }
    public String getName(){
        return name;// you can use this.name
    }

    public abstract void eat();
    void sleep(){

    }
    public abstract void speak();

    public void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }

}

class Dog extends Animal{
    String breed;
    public Dog(String name, String color, int age,String breed){
        super(name,color,age);
        this.breed=breed;
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat Bones and meat");
    }

    @Override
    public void speak() {
        System.out.println("Wao wao Wuff Wuff");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(breed);
    }
    void run(){
        System.out.println("Dog running");
    }
}

class Cat extends Animal{


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat fish");
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}
