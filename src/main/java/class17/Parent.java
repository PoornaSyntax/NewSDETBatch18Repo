package class17;

public class Parent {
    String name = "Israel";
    Parent(){
        System.out.println("Parent is born");
    }
}

class Child extends Parent {
    //String name = "Maria";
    Child(){
        System.out.println("Child is born");
    }
    void print(){
        String name="Levi";
        System.out.println(super.name);
    }

}

class Tester{
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}