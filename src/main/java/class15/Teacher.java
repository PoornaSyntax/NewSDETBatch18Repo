package class15;

public class Teacher {
    private String name;
    private String address;
    private int age;
    private double weight;

    public Teacher(String name, String address, int age){
        this.name=name;
        this.address= address;
        this.age=age;

    }
    public Teacher(String name, String address, int age, double weight){
        this(name,address,age);
        this.weight=weight;
    }


    public void printInfo(){
        System.out.println(name +" " + address);
    }

    public static void main(String[] args) {

          Teacher t = new Teacher("Mary","123 Main St",22);
          t.printInfo();
//        new  Teacher("Mary","123,Main st", 22, 120).printInfo();
//        new  Teacher("Harry" ,"456,Taylor St",26,130).printInfo();
    }
}
