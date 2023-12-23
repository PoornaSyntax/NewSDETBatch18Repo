package class21;

public abstract class Animal {

    public abstract void eat();
    public void sleep(){
        System.out.println("Animals Sleep");
    }
    public abstract void speak();

}

class Dog extends Animal{

    public void eat(){
        System.out.println("Dogs like to eat meat");
    }
    public void speak(){
        System.out.println("Wuff wuff");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cats like to eat fish");
    }
    public void speak(){

    }
}
