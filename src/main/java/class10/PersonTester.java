package class10;

public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Person();
                p1.name="Adams";
        p1.age=23;
        p1.weight=170;
        p1.Gender='M';
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.weight);
        System.out.println(p1.Gender);
        p1.eat();
        p1.sleep();

    }
}
