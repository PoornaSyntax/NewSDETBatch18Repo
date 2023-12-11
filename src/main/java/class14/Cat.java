package class14;

public class Cat {
    //instance variable
    String name="kitti";

    void printName(){
        //local variable
        String name = "Pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c= new Cat();
        System.out.println(c.name);
        c.printName();
    }

}
