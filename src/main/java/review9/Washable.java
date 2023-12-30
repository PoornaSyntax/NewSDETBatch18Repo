package review9;

public interface Washable {
    void wash();
}
 interface TrustAble{
    void trust();
}

class Horse implements Washable,TrustAble{
    public void wash(){
        System.out.println("Washing a Horse");
    }
    public void trust(){
        System.out.println("Horses can be trusted they are loyal");
    }
}

class Car implements Washable,TrustAble{

    public void trust(){
        System.out.println("you can trust Totota cars");
    }
    public void wash(){
        System.out.println("Washing the car");
    }
}

class Laptop{

}