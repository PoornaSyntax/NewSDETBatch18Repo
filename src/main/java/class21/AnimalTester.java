package class21;

public class AnimalTester {
    public static void main(String[] args) {

        //Animal animal = new Animal();//not allowed it is abstract
        Cat c = new Cat("Mano","Black");

        c.eat();
        c.speak();
        c.sleep();
        Animal c2=new Cat("Mano","Black");
        Animal c3= new Dog("Mano","Black");
        c2.printInfo();
        Animal [] arr={new Cat("Mano","Black"), new Dog("Mano","Black")};
        for(Animal a:arr){
            a.eat();
            a.speak();
            a.sleep();
        }
    }
}
