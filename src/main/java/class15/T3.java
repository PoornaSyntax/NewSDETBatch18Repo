package class15;

public class T3 {
    /*
    Write a java class that have 4 constuctors with 4 different access
    levels of constructors(private,public,default,protected)
    and create 4 objects of this class:1-inside same class; 2-from outside the class
    3-from different class inside different package adn observe result
     */

    private String name;
    private int age;

    public T3(){

        System.out.println("public constructor with no parameters");
    }
  T3(String sName){

        System.out.println("Default constructor "+ "Name "+sName);
  }
  private T3(int sAge,String sName){

        System.out.println("Private constructor "+" Age "+sAge+" Name "+sName);
  }
  protected T3(String sName, int sAge){
      System.out.println("Protected constructor "+" Name "+sName+" Age "+sAge);

  }

    public static void main(String[] args) {
        T3 publicConstructorObj = new T3();


        T3 DefaultConstructorObj = new T3("Jim");


        T3 privateConstructorObj = new T3(22,"John");


        T3 protectedConstructorObj = new T3("Anna",23);
    }
}
