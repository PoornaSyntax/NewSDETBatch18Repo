package class18;

public  class Parent1 {

    void marry(){
        System.out.println("Marry the girl w that we have selected for you");

    }
    void sleep(){
        System.out.println("Sleep 8 hours");
    }
}
class Karimi extends Parent1 {

    void marry(){
        System.out.println("I want to marry Scarett Johansson");
    }

}

class Tester{
    public static void main(String[] args) {
        Karimi k = new Karimi();
        k.marry();
        k.sleep();
    }
}