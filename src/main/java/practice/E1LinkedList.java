package practice;

import review10.Dog;

import java.util.LinkedList;

public class E1LinkedList {
    public static void main(String[] args) {
        LinkedList<Dog> dogs=new LinkedList<>();
        Dog d1=new Dog("Jacky","German",12);
        dogs.add(d1);
    }
}
